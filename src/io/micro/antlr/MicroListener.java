// Generated from /home/nikhil/Documents/Java/Micro/src/Micro.g4 by ANTLR 4.7
package io.micro.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MicroParser}.
 */
public interface MicroListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MicroParser#type_id}.
	 * @param ctx the parse tree
	 */
	void enterType_id(MicroParser.Type_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#type_id}.
	 * @param ctx the parse tree
	 */
	void exitType_id(MicroParser.Type_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(MicroParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(MicroParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#mid}.
	 * @param ctx the parse tree
	 */
	void enterMid(MicroParser.MidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#mid}.
	 * @param ctx the parse tree
	 */
	void exitMid(MicroParser.MidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#bx_type}.
	 * @param ctx the parse tree
	 */
	void enterBx_type(MicroParser.Bx_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#bx_type}.
	 * @param ctx the parse tree
	 */
	void exitBx_type(MicroParser.Bx_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MicroParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MicroParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(MicroParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(MicroParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(MicroParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(MicroParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(MicroParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(MicroParser.MulContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#div}.
	 * @param ctx the parse tree
	 */
	void enterDiv(MicroParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#div}.
	 * @param ctx the parse tree
	 */
	void exitDiv(MicroParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MicroParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MicroParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#negative_value}.
	 * @param ctx the parse tree
	 */
	void enterNegative_value(MicroParser.Negative_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#negative_value}.
	 * @param ctx the parse tree
	 */
	void exitNegative_value(MicroParser.Negative_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MicroParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MicroParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#load_inst}.
	 * @param ctx the parse tree
	 */
	void enterLoad_inst(MicroParser.Load_instContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#load_inst}.
	 * @param ctx the parse tree
	 */
	void exitLoad_inst(MicroParser.Load_instContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#include_inst}.
	 * @param ctx the parse tree
	 */
	void enterInclude_inst(MicroParser.Include_instContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#include_inst}.
	 * @param ctx the parse tree
	 */
	void exitInclude_inst(MicroParser.Include_instContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#compiler_inst}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_inst(MicroParser.Compiler_instContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#compiler_inst}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_inst(MicroParser.Compiler_instContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(MicroParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(MicroParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#module_dec}.
	 * @param ctx the parse tree
	 */
	void enterModule_dec(MicroParser.Module_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#module_dec}.
	 * @param ctx the parse tree
	 */
	void exitModule_dec(MicroParser.Module_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(MicroParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(MicroParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#array_def}.
	 * @param ctx the parse tree
	 */
	void enterArray_def(MicroParser.Array_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#array_def}.
	 * @param ctx the parse tree
	 */
	void exitArray_def(MicroParser.Array_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void enterFormalParam(MicroParser.FormalParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void exitFormalParam(MicroParser.FormalParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#func_call_out}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_out(MicroParser.Func_call_outContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#func_call_out}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_out(MicroParser.Func_call_outContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#func_call_local}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_local(MicroParser.Func_call_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#func_call_local}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_local(MicroParser.Func_call_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#func_call_local_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_local_stmt(MicroParser.Func_call_local_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#func_call_local_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_local_stmt(MicroParser.Func_call_local_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#func_call_out_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call_out_stmt(MicroParser.Func_call_out_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#func_call_out_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call_out_stmt(MicroParser.Func_call_out_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#varset}.
	 * @param ctx the parse tree
	 */
	void enterVarset(MicroParser.VarsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#varset}.
	 * @param ctx the parse tree
	 */
	void exitVarset(MicroParser.VarsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#local_vardef}.
	 * @param ctx the parse tree
	 */
	void enterLocal_vardef(MicroParser.Local_vardefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#local_vardef}.
	 * @param ctx the parse tree
	 */
	void exitLocal_vardef(MicroParser.Local_vardefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#array_ref}.
	 * @param ctx the parse tree
	 */
	void enterArray_ref(MicroParser.Array_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#array_ref}.
	 * @param ctx the parse tree
	 */
	void exitArray_ref(MicroParser.Array_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#array_set_stmt}.
	 * @param ctx the parse tree
	 */
	void enterArray_set_stmt(MicroParser.Array_set_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#array_set_stmt}.
	 * @param ctx the parse tree
	 */
	void exitArray_set_stmt(MicroParser.Array_set_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#type_casting}.
	 * @param ctx the parse tree
	 */
	void enterType_casting(MicroParser.Type_castingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#type_casting}.
	 * @param ctx the parse tree
	 */
	void exitType_casting(MicroParser.Type_castingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#arrayname}.
	 * @param ctx the parse tree
	 */
	void enterArrayname(MicroParser.ArraynameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#arrayname}.
	 * @param ctx the parse tree
	 */
	void exitArrayname(MicroParser.ArraynameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(MicroParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(MicroParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#greaterthan}.
	 * @param ctx the parse tree
	 */
	void enterGreaterthan(MicroParser.GreaterthanContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#greaterthan}.
	 * @param ctx the parse tree
	 */
	void exitGreaterthan(MicroParser.GreaterthanContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#lesserthan}.
	 * @param ctx the parse tree
	 */
	void enterLesserthan(MicroParser.LesserthanContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#lesserthan}.
	 * @param ctx the parse tree
	 */
	void exitLesserthan(MicroParser.LesserthanContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#greaterthanE}.
	 * @param ctx the parse tree
	 */
	void enterGreaterthanE(MicroParser.GreaterthanEContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#greaterthanE}.
	 * @param ctx the parse tree
	 */
	void exitGreaterthanE(MicroParser.GreaterthanEContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#lesserthanE}.
	 * @param ctx the parse tree
	 */
	void enterLesserthanE(MicroParser.LesserthanEContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#lesserthanE}.
	 * @param ctx the parse tree
	 */
	void exitLesserthanE(MicroParser.LesserthanEContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#notequalto}.
	 * @param ctx the parse tree
	 */
	void enterNotequalto(MicroParser.NotequaltoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#notequalto}.
	 * @param ctx the parse tree
	 */
	void exitNotequalto(MicroParser.NotequaltoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#equalto}.
	 * @param ctx the parse tree
	 */
	void enterEqualto(MicroParser.EqualtoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#equalto}.
	 * @param ctx the parse tree
	 */
	void exitEqualto(MicroParser.EqualtoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#false_con}.
	 * @param ctx the parse tree
	 */
	void enterFalse_con(MicroParser.False_conContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#false_con}.
	 * @param ctx the parse tree
	 */
	void exitFalse_con(MicroParser.False_conContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#true_con}.
	 * @param ctx the parse tree
	 */
	void enterTrue_con(MicroParser.True_conContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#true_con}.
	 * @param ctx the parse tree
	 */
	void exitTrue_con(MicroParser.True_conContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#boolval}.
	 * @param ctx the parse tree
	 */
	void enterBoolval(MicroParser.BoolvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#boolval}.
	 * @param ctx the parse tree
	 */
	void exitBoolval(MicroParser.BoolvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#notboolval}.
	 * @param ctx the parse tree
	 */
	void enterNotboolval(MicroParser.NotboolvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#notboolval}.
	 * @param ctx the parse tree
	 */
	void exitNotboolval(MicroParser.NotboolvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#logicexpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicexpr(MicroParser.LogicexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#logicexpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicexpr(MicroParser.LogicexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#enclosed_boolval}.
	 * @param ctx the parse tree
	 */
	void enterEnclosed_boolval(MicroParser.Enclosed_boolvalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#enclosed_boolval}.
	 * @param ctx the parse tree
	 */
	void exitEnclosed_boolval(MicroParser.Enclosed_boolvalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#andboolexpr}.
	 * @param ctx the parse tree
	 */
	void enterAndboolexpr(MicroParser.AndboolexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#andboolexpr}.
	 * @param ctx the parse tree
	 */
	void exitAndboolexpr(MicroParser.AndboolexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#orboolexpr}.
	 * @param ctx the parse tree
	 */
	void enterOrboolexpr(MicroParser.OrboolexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#orboolexpr}.
	 * @param ctx the parse tree
	 */
	void exitOrboolexpr(MicroParser.OrboolexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolexpr(MicroParser.BoolexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#boolexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolexpr(MicroParser.BoolexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#boolparseexpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolparseexpr(MicroParser.BoolparseexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#boolparseexpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolparseexpr(MicroParser.BoolparseexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void enterIf_stmt(MicroParser.If_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#if_stmt}.
	 * @param ctx the parse tree
	 */
	void exitIf_stmt(MicroParser.If_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#elif_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElif_stmt(MicroParser.Elif_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#elif_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElif_stmt(MicroParser.Elif_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElse_stmt(MicroParser.Else_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElse_stmt(MicroParser.Else_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stmt(MicroParser.While_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#while_stmt}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stmt(MicroParser.While_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#init_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInit_stmt(MicroParser.Init_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#init_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInit_stmt(MicroParser.Init_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#uval_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUval_stmt(MicroParser.Uval_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#uval_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUval_stmt(MicroParser.Uval_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#uval_get}.
	 * @param ctx the parse tree
	 */
	void enterUval_get(MicroParser.Uval_getContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#uval_get}.
	 * @param ctx the parse tree
	 */
	void exitUval_get(MicroParser.Uval_getContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#add_inc_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAdd_inc_stmt(MicroParser.Add_inc_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#add_inc_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAdd_inc_stmt(MicroParser.Add_inc_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#sub_inc_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSub_inc_stmt(MicroParser.Sub_inc_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#sub_inc_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSub_inc_stmt(MicroParser.Sub_inc_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#mul_inc_stmt}.
	 * @param ctx the parse tree
	 */
	void enterMul_inc_stmt(MicroParser.Mul_inc_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#mul_inc_stmt}.
	 * @param ctx the parse tree
	 */
	void exitMul_inc_stmt(MicroParser.Mul_inc_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#div_inc_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDiv_inc_stmt(MicroParser.Div_inc_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#div_inc_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDiv_inc_stmt(MicroParser.Div_inc_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(MicroParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(MicroParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#ptype}.
	 * @param ctx the parse tree
	 */
	void enterPtype(MicroParser.PtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#ptype}.
	 * @param ctx the parse tree
	 */
	void exitPtype(MicroParser.PtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(MicroParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(MicroParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(MicroParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(MicroParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MicroParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MicroParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#elem}.
	 * @param ctx the parse tree
	 */
	void enterElem(MicroParser.ElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#elem}.
	 * @param ctx the parse tree
	 */
	void exitElem(MicroParser.ElemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#specList}.
	 * @param ctx the parse tree
	 */
	void enterSpecList(MicroParser.SpecListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#specList}.
	 * @param ctx the parse tree
	 */
	void exitSpecList(MicroParser.SpecListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#union_def_key}.
	 * @param ctx the parse tree
	 */
	void enterUnion_def_key(MicroParser.Union_def_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#union_def_key}.
	 * @param ctx the parse tree
	 */
	void exitUnion_def_key(MicroParser.Union_def_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#union_def}.
	 * @param ctx the parse tree
	 */
	void enterUnion_def(MicroParser.Union_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#union_def}.
	 * @param ctx the parse tree
	 */
	void exitUnion_def(MicroParser.Union_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link MicroParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MicroParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MicroParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MicroParser.ProgramContext ctx);
}