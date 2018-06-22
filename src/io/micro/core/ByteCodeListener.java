package io.micro.core;

import io.micro.antlr.MicroBaseListener;
import io.micro.antlr.MicroParser;
import io.micro.log.Log;
import javassist.*;

import static io.micro.core.ParserPool.cp;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ByteCodeListener extends MicroBaseListener{

    StringBuilder methodBuilder = new StringBuilder();
    CtClass clazz;
    String module_name;

    static final String TAG = ByteCodeListener.class.getCanonicalName();
    static final String INIT_SUUFIX = "ld_union_def_";

    ArrayList<String> packages = new ArrayList<>();

    public ByteCodeListener(){
        require("java.lang.Math");
        require("io.micro.uni.Union");
        require("io.micro.uni.UnionDef");
        Log.info("listener","Compiler Ready!");
    }

    @Override
    public void enterModule_dec(MicroParser.Module_decContext ctx) {
        clazz = cp.makeClass(ctx.mid().getText());
        Log.info(TAG,"Compiling " + ctx.mid().getText());
        String n = ctx.mid().getText();
        module_name = n.replace(".", "/");
        super.enterModule_dec(ctx);
    }

    protected void require(String classorpack){
        if(packages.contains(classorpack)) return;
        else cp.importPackage(classorpack);
    }

    public byte[] getBytes() throws IOException, CannotCompileException {
        return clazz.toBytecode();
    }

    @Override
    public void enterWhile_stmt(MicroParser.While_stmtContext ctx) {
        methodBuilder.append("while(" + convertBoolparseexpr(ctx.boolparseexpr()) + "){");
        super.enterWhile_stmt(ctx);
    }

    @Override
    public void exitWhile_stmt(MicroParser.While_stmtContext ctx) {
        methodBuilder.append("}");
        super.exitWhile_stmt(ctx);
    }

    @Override
    public void enterTryblock(MicroParser.TryblockContext ctx) {
        methodBuilder.append("try {");
        super.enterTryblock(ctx);
    }

    @Override
    public void exitTryblock(MicroParser.TryblockContext ctx) {
        methodBuilder.append("}");
        super.exitTryblock(ctx);
    }

    @Override
    public void enterExceptblock(MicroParser.ExceptblockContext ctx) {
        methodBuilder.append("catch(" + ctx.mid().getText() + " " + ctx.id().getText() + "){");
        super.enterExceptblock(ctx);
    }

    @Override
    public void exitExceptblock(MicroParser.ExceptblockContext ctx) {
        methodBuilder.append("}");
        super.exitExceptblock(ctx);
    }

    @Override
    public void enterImport_stmt(MicroParser.Import_stmtContext ctx) {
        Log.debug("require","Importing package " + ctx.mid().getText());
        require(ctx.mid().getText());
        super.enterImport_stmt(ctx);
    }

    public void output(String dst){
        try {
            byte[] data = getBytes();
            Files.write(Paths.get(dst), data);
            Log.info("generation","Finished Writing file: " + dst);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
    }

    public String convertStringConcat(MicroParser.String_concatContext ctx){
        StringBuilder stringBuilder = new StringBuilder();
        if(ctx.strcval(0).STRING()!= null){
            stringBuilder.append(ctx.strcval(0).STRING().getText());
        } else {
            stringBuilder.append(GET_VALUE(ctx.strcval(0).value()));
        }
        for(int x = 1; x < ctx.strcval().size(); x ++){
            stringBuilder.append("+");
            if(ctx.strcval(x).STRING()!= null){
                stringBuilder.append(ctx.strcval(x).STRING().getText());
            } else {
                stringBuilder.append(GET_VALUE(ctx.strcval(x).value()));
            }
        }
        return stringBuilder.toString();
    }

    @Override
    public void enterLocal_vardef(MicroParser.Local_vardefContext ctx) {
        String type = ctx.ptype().getText();
        String cmd;
        if(ctx.CONST() != null){
            String val = GET_TYPE(ctx.type());
            cmd = "final" + type + " " + ctx.id().getText() + "=" + val + ";";
        } else if(ctx.type() != null){
            String val = GET_TYPE(ctx.type());
            cmd = type + " " + ctx.id().getText() + "=" + val + ";";
        } else {
            cmd = type + " " + ctx.id().getText() + ";";
        }
        methodBuilder.append(cmd);
        super.enterLocal_vardef(ctx);
    }

    @Override
    public void enterLoad_inst(MicroParser.Load_instContext ctx) {
        String path = ctx.STRING().getText();
        if(ctx.URL() == null){
            ParserPool.program(path.substring(1, path.length()-1));
        } else {
            URLLoader loader = new URLLoader(path.substring(1, path.length()-1));
            loader.load();
            ParserPool.program(loader);
        }
        super.enterLoad_inst(ctx);
    }

    private void method(String name, String ret, String parameters){
        try {
            String body = methodBuilder.toString();
            methodBuilder = new StringBuilder();
            String jav = "public static " + ret + " " + name + "(" + parameters + "){" + body + "}";
            //System.out.println(jav);
            CtMethod method = CtMethod.make(jav, clazz);
            clazz.addMethod(method);
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
    }

    private void allocate(String src){
        try {
            //Log.info(TAG, src);
            clazz.addField(CtField.make(src, clazz));
        } catch (CannotCompileException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void enterFunc_call_out_stmt(MicroParser.Func_call_out_stmtContext ctx) {
        methodBuilder.append(convertFunc_call_out(ctx.func_call_out()) + ";");
        super.enterFunc_call_out_stmt(ctx);
    }

    @Override
    public void enterFunc_call_local_stmt(MicroParser.Func_call_local_stmtContext ctx) {
        methodBuilder.append(convertFuncCallLocal(ctx.func_call_local()) + ";");
        super.enterFunc_call_local_stmt(ctx);
    }

    @Override
    public void enterUnion_def(MicroParser.Union_defContext ctx) {
        ctx.union_def_key().forEach((key) -> {
            String x = key.id().getText();
            allocate("static final UnionDef " + x + " = new UnionDef();");   //Allocate a variable with the name of the union
            key.specList().elem().forEach(e -> {
                boolean constant = e.CONST() != null;
                methodBuilder.append(x + ".register(\"" + e.id().getText() + "\"," + constant+");");
            });
        });
        super.enterUnion_def(ctx);
    }

    public String convertUval_Get(MicroParser.Uval_getContext ctx){
        String str = ctx.mid().getText() + ".get(\"" + ctx.id().getText() + "\")";
        return str;
    }

    @Override
    public void exitUnion_def(MicroParser.Union_defContext ctx) {
        method(INIT_SUUFIX+ctx.id().getText(), "void", "");
        super.exitUnion_def(ctx);
    }

    @Override
    public void enterField(MicroParser.FieldContext ctx) {
        String field_t = ctx.ptype().getText();
        String field_n = ctx.id().getText();
        if(ctx.CONST() != null){
            allocate("static final "+field_t + " " + field_n + " = " + GET_TYPE(ctx.type()) + ";");
        } else {
            if(ctx.type() != null){
                allocate("static " + field_t + " " + field_n + " = " + GET_TYPE(ctx.type()) + ";");
            } else {
                allocate("static "+field_t + " " + field_n + ";");
            }
        }
        super.enterField(ctx);
    }

    @Override
    public void enterVarset(MicroParser.VarsetContext ctx) {
        String cmd = ctx.mid().getText() + "=" + GET_TYPE(ctx.type());
        methodBuilder.append(cmd + ";");
        super.enterVarset(ctx);
    }

    private String convertFunc_call_out(MicroParser.Func_call_outContext ctx){
        String top = ctx.mid().getText();
        String sub = ctx.id().getText();
        StringBuilder sb = new StringBuilder();
        ctx.formalParam().type().forEach((prm) -> {
            sb.append(GET_TYPE(prm));
            if(ctx.formalParam().type().size() > 1 && ctx.formalParam().type().indexOf(prm) < ctx.formalParam().type().size()-1){
                sb.append(",");
            }
        });
        String params = sb.toString();
        return top + "." + sub + "(" + params + ")";
    }

    private String GET_TYPE(MicroParser.TypeContext ctx){
        if(ctx.INTEGER() != null) return ctx.INTEGER().getText();
        else if(ctx.TRUE() != null) return ctx.TRUE().getText();
        else if(ctx.FALSE() != null) return ctx.FALSE().getText();
        else if(ctx.DOUBLE() != null) return ctx.DOUBLE().getText();
        else if(ctx.FLOAT() != null) return ctx.FLOAT().getText();
        else if(ctx.STRING() != null) return ctx.STRING().getText();
        else if(ctx.id() != null) return ctx.id().getText();
        else if(ctx.mid() != null) return ctx.mid().getText();
        else if(ctx.func_call_out() != null) return convertFunc_call_out(ctx.func_call_out());
        else if(ctx.func_call_local() != null) return convertFuncCallLocal(ctx.func_call_local());
        else if(ctx.type_casting() != null) return convertTypeCasting(ctx.type_casting());
        else if(ctx.expr() != null) return convertExpr(ctx.expr());
        else if(ctx.array_ref() != null) return convertArrayRef(ctx.array_ref());
        else if(ctx.uval_get() != null) return convertUval_Get(ctx.uval_get());
        else if(ctx.string_concat() != null) return convertStringConcat(ctx.string_concat());
        else return null;
    }

    private String GET_VALUE(MicroParser.ValueContext ctx){
        if(ctx.INTEGER() != null) return ctx.INTEGER().getText();
        else if(ctx.DOUBLE() != null) return ctx.DOUBLE().getText();
        else if(ctx.FLOAT() != null) return ctx.FLOAT().getText();
        else if(ctx.mid() != null) return ctx.mid().getText();
        else if(ctx.func_call_out() != null) return convertFunc_call_out(ctx.func_call_out());
        else if(ctx.type_casting() != null) return convertTypeCasting(ctx.type_casting());
        else if(ctx.expr() != null) return "(" + convertExpr(ctx.expr()) + ")";
        else if(ctx.func_call_local() != null) return convertFuncCallLocal(ctx.func_call_local());
        else if(ctx.array_ref() != null) return convertArrayRef(ctx.array_ref());
        else if(ctx.uval_get() != null) return convertUval_Get(ctx.uval_get());
        else return null;
    }

    private String convertVar_Set(MicroParser.Var_SetContext ctx){
        if(ctx.add_inc() != null) return convertAddInc(ctx.add_inc());
        else if(ctx.mul_inc() != null) return convertMulInc(ctx.mul_inc());
        else if(ctx.div_inc() != null) return convertDivInc(ctx.div_inc());
        else if(ctx.sub_inc() != null) return convertSubInc(ctx.sub_inc());
        else return null;
    }

    private String convertTypeCasting(MicroParser.Type_castingContext ctx){
        String type = ctx.ptype().getText();
        String value = GET_TYPE(ctx.type());
        return "(" + type + ")" + value;
    }

    @Override
    public void enterUval_stmt(MicroParser.Uval_stmtContext ctx) {
        String call_token = ctx.mid().getText()+".val";
        String type_token = GET_TYPE(ctx.type());
        String param_token = "(\""+ctx.id().getText()+"\", "+type_token+");";
        methodBuilder.append(call_token+param_token);
        super.enterUval_stmt(ctx);
    }

    private String convertAddInc(MicroParser.Add_incContext ctx){
        return ctx.mid().getText() + "+=" + GET_TYPE(ctx.type());
    }


    private String convertMulInc(MicroParser.Mul_incContext ctx){
        return ctx.mid().getText() + "+=" + GET_TYPE(ctx.type());
    }


    private String convertSubInc(MicroParser.Sub_incContext ctx){
        return ctx.mid().getText() + "+=" + GET_TYPE(ctx.type());
    }


    private String convertDivInc(MicroParser.Div_incContext ctx){
        return ctx.mid().getText() + "+=" + GET_TYPE(ctx.type());
    }

    @Override
    public void enterAdd_inc_stmt(MicroParser.Add_inc_stmtContext ctx) {
        methodBuilder.append(convertAddInc(ctx.add_inc())).append(";");
        super.enterAdd_inc_stmt(ctx);
    }


    @Override
    public void enterMul_inc_stmt(MicroParser.Mul_inc_stmtContext ctx) {
        methodBuilder.append(convertMulInc(ctx.mul_inc())).append(";");
        super.enterMul_inc_stmt(ctx);
    }


    @Override
    public void enterSub_inc_stmt(MicroParser.Sub_inc_stmtContext ctx) {
        methodBuilder.append(convertSubInc(ctx.sub_inc())).append(";");
        super.enterSub_inc_stmt(ctx);
    }


    @Override
    public void enterDiv_inc_stmt(MicroParser.Div_inc_stmtContext ctx) {
        methodBuilder.append(convertDivInc(ctx.div_inc())).append(";");
        super.enterDiv_inc_stmt(ctx);
    }

    @Override
    public void enterInclude_inst(MicroParser.Include_instContext ctx) {
        String pack = ctx.STRING().toString().replaceAll("\"", "");
        try {
            if(ctx.URL() != null){
                URL url = new URL(pack);
                String[] pathAndName = splitFilename(url.getFile());
                if(pathAndName[1].endsWith(".jar")){
                    URLLoader urlLoader = new URLLoader(pack);
                    File temp = new File(System.getProperty("java.io.tmpdir") + "/micro/" + pathAndName[1]);
                    if(!temp.getParentFile().exists()) temp.mkdir();
                    if(!temp.exists()) temp.createNewFile();
                    temp.deleteOnExit();
                    urlLoader.RETREIVE(temp);
                    cp.insertClassPath(temp.getAbsolutePath());
                } else {
                    URLClassPath classPath = new URLClassPath(url.getHost(), url.getPort(), pathAndName[0], pathAndName[1].replaceAll("/", "."));
                    cp.insertClassPath(classPath);
                }
            } else {
                cp.insertClassPath(pack);
            }
        } catch (NotFoundException e) {
            Log.error(TAG, pack + " cannot be used or does not exist", e);
        } catch (MalformedURLException e) {
            Log.error(TAG, pack + " is malformed ", e);
        } catch (IOException e) {
            Log.error(TAG, "io_error", e);
        }
        super.enterInclude_inst(ctx);
    }

    private static String[] splitFilename(String filename){
        int index_of_last = filename.lastIndexOf('/');
        String path = filename.substring(0, index_of_last);
        String name = filename.substring(index_of_last+1, filename.length());
        return new String[]{path, name};
    }

    @Override
    public void enterArray_set_stmt(MicroParser.Array_set_stmtContext ctx) {
        String ap = convertArrayRef(ctx.array_ref()) + "=" + GET_TYPE(ctx.type());
        methodBuilder.append(ap).append(";");
        super.enterArray_set_stmt(ctx);
    }

    @Override
    public void enterArray_def(MicroParser.Array_defContext ctx) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(ctx.type_id().getText());
        for (int i = 0; i < ctx.type().size(); i++) { stringBuilder.append("[]"); }
        stringBuilder.append(" ").append(ctx.id().getText()).append(" = ");
        stringBuilder.append("new ").append(ctx.type_id().getText());
        ctx.type().forEach((type)
                -> stringBuilder.append("[").append(GET_TYPE(type)).append("]"));
        stringBuilder.append(";");
//        System.out.println(stringBuilder.toString());
        methodBuilder.append(stringBuilder.toString());
        super.enterArray_def(ctx);
    }

    @Override
    public void enterLoad_union_def(MicroParser.Load_union_defContext ctx) {
        String text = ctx.mid().getText();
        String name = text.substring(text.lastIndexOf('.')+1, text.length());
        String method_name = "ld_union_def_" + name + "()";
        String module_name = text.substring(0, text.lastIndexOf('.')+1);
        methodBuilder.append(module_name).append(method_name).append(";");
        super.enterLoad_union_def(ctx);
    }

    private String convertFuncCallLocal(MicroParser.Func_call_localContext ctx){
        StringBuilder sb = new StringBuilder();
        ctx.formalParam().type().forEach((prm) -> {
            sb.append(GET_TYPE(prm));
            if(ctx.formalParam().type().size() > 1){
                sb.append(",");
            }
        });
        String params = sb.toString();
        return ctx.id().getText() + "(" + params + ")";
    }

    private String convertArrayRef(MicroParser.Array_refContext ctx){
        String name = ctx.mid().getText();
        StringBuilder sb = new StringBuilder();
        ctx.type().forEach((tp) -> sb.append("[" + GET_TYPE(tp) + "]"));
        return name + sb.toString();
    }

    private String convertExpr(MicroParser.ExprContext ctx){
        String ret = null;
        if(ctx.add() != null){
            ret = convertExpr(ctx.expr(0)) + "+" + convertExpr(ctx.expr(1));
        }
        if(ctx.sub() != null){
            ret = convertExpr(ctx.expr(0)) + "-" + convertExpr(ctx.expr(1));
        }
        if(ctx.mul() != null){
            ret = convertExpr(ctx.expr(0)) + "*" + convertExpr(ctx.expr(1));
        }
        if(ctx.div() != null){
            ret = convertExpr(ctx.expr(0)) + "/" + convertExpr(ctx.expr(1));
        }
        if(ctx.mod() != null) {
            ret = convertExpr(ctx.expr(0)) + "%" + convertExpr(ctx.expr(1));
        }
        if(ctx.value() != null){
            ret = GET_VALUE(ctx.value());
        }
        if(ctx.negative_value() != null){
            ret = "-" + GET_VALUE(ctx.negative_value().value());
        }
        return ret;
    }

    @Override
    public void enterReturn_stmt(MicroParser.Return_stmtContext ctx) {
        methodBuilder.append("return " + GET_TYPE(ctx.type()) + ";");
        super.enterReturn_stmt(ctx);
    }

    @Override
    public void exitFunction(MicroParser.FunctionContext ctx) {
        String ret = ctx.bx_type() != null ? ctx.bx_type().getText() : ctx.arrayname().getText();
        String name = ctx.id().getText();
        StringBuilder sb = new StringBuilder();
        ctx.paramList().param().forEach((parm) -> {
            String prm_n = parm.id().getText();
            String prm_t = parm.ptype().getText();
            sb.append(prm_t + " " + prm_n);
            if(ctx.paramList().param().indexOf(parm) < ctx.paramList().param().size()-1){
                sb.append(",");
            }
        });
        String param = sb.toString();
        method(name, ret, param);
        super.enterFunction(ctx);
    }

    private String convertLogicExpr(MicroParser.LogicexprContext ctx) {
        if (ctx.boolval() != null) {
            return convertBoolVal(ctx.boolval());
        } else if (ctx.andboolexpr() != null) {
            return convertAndExpr(ctx.andboolexpr());
        } else if (ctx.orboolexpr() != null) {
            return convertOrExpr(ctx.orboolexpr());
        } else if (ctx.notboolval() != null) {
            return "!(" + convertBoolVal(ctx.notboolval().boolval()) + ")";
        } else {
            throw new RuntimeException("Invalid Logic Expression!");
        }
    }

    private String convertBoolVal(MicroParser.BoolvalContext ctx) {
        if (ctx.equalto() != null) {
            MicroParser.EqualtoContext eqctx = ctx.equalto();//System.out.println(ret);
            return GET_TYPE(eqctx.type(0)) + "==" + GET_TYPE(eqctx.type(1));
        } else if (ctx.greaterthan() != null) {
            MicroParser.GreaterthanContext gtctx = ctx.greaterthan();
            return GET_TYPE(gtctx.type(0)) + ">" + GET_TYPE(gtctx.type(1));
        } else if (ctx.lesserthan() != null) {
            MicroParser.LesserthanContext ltctx = ctx.lesserthan();
            return GET_TYPE(ltctx.type(0)) + "<" + GET_TYPE(ltctx.type(1));
        } else if (ctx.greaterthanE() != null) {
            MicroParser.GreaterthanEContext gtectx = ctx.greaterthanE();
            return GET_TYPE(gtectx.type(0)) + ">=" + GET_TYPE(gtectx.type(1));
        } else if (ctx.lesserthanE() != null) {
            MicroParser.LesserthanEContext ltectx = ctx.lesserthanE();
            return GET_TYPE(ltectx.type(0)) + "<=" + GET_TYPE(ltectx.type(1));
        } else if (ctx.notequalto() != null) {
            return GET_TYPE(ctx.notequalto().type(0)) + "!=" + GET_TYPE(ctx.notequalto().type(1));
        } else if (ctx.false_con() != null) {
            return "false";
        } else if (ctx.true_con() != null) {
            return "true";
        } else if (ctx.type() != null) {
            return GET_TYPE(ctx.type());
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void enterIf_stmt(MicroParser.If_stmtContext ctx) {
        methodBuilder.append("if(" + convertBoolparseexpr(ctx.boolparseexpr()) + "){");
        super.enterIf_stmt(ctx);
    }

    @Override
    public void enterElif_stmt(MicroParser.Elif_stmtContext ctx) {
        methodBuilder.append("else if(" + convertBoolparseexpr(ctx.boolparseexpr()) + "){");
        super.enterElif_stmt(ctx);
    }

    @Override
    public void exitElif_stmt(MicroParser.Elif_stmtContext ctx) {
        methodBuilder.append("}");
        super.exitElif_stmt(ctx);
    }

    @Override
    public void exitIf_stmt(MicroParser.If_stmtContext ctx) {
        methodBuilder.append("}");
        super.exitIf_stmt(ctx);
    }

    @Override
    public void enterElse_stmt(MicroParser.Else_stmtContext ctx) {
        methodBuilder.append("else {");
        super.enterElse_stmt(ctx);
    }

    @Override
    public void exitElse_stmt(MicroParser.Else_stmtContext ctx) {
        methodBuilder.append("}");
        super.exitElse_stmt(ctx);
    }

    private String convertAndExpr(MicroParser.AndboolexprContext ctx) {
        return "(" + convertLogicExpr(ctx.logicexpr(0)) + ")&&(" + convertLogicExpr(ctx.logicexpr(1)) + ")";
    }

    private String convertOrExpr(MicroParser.OrboolexprContext ctx) {
        return "(" + convertLogicExpr(ctx.logicexpr(0)) + ")||(" + convertLogicExpr(ctx.logicexpr(1)) + ")";
    }

    private String convertEnclosedBoolVal(MicroParser.Enclosed_boolvalContext ctx) {
        return "(" + convertBoolVal(ctx.boolval()) + ")";
    }

    private String convertBoolExpr(MicroParser.BoolexprContext ctx) {
        StringBuilder builder = new StringBuilder();
        if (ctx.andboolexpr() != null) {
            builder.append(convertAndExpr(ctx.andboolexpr()));
        } else if (ctx.orboolexpr() != null) {
            builder.append(convertOrExpr(ctx.orboolexpr()));
        } else if (ctx.boolval() != null) {
            builder.append(convertBoolVal(ctx.boolval()));
        } else if (ctx.enclosed_boolval() != null) {
            builder.append(convertEnclosedBoolVal(ctx.enclosed_boolval()));
        }
        return builder.toString();
    }

    public String convertBoolparseexpr(MicroParser.BoolparseexprContext ctx) {
        if ((ctx.NOT() != null) && (ctx.boolexpr() != null)) {
            String gen = "!" + convertBoolExpr(ctx.boolexpr());
            //System.out.println(gen);
            return gen;
        } else {
            String gen = convertBoolExpr(ctx.boolexpr());
            //System.out.println(gen);
            return gen;
        }
    }
}
