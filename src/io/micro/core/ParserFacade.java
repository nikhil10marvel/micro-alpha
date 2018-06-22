package io.micro.core;

import io.micro.antlr.MicroLexer;
import io.micro.antlr.MicroParser;
import io.micro.log.Log;
import javassist.ClassPool;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class ParserFacade implements Facade{

    private String file;
    ByteCodeListener listener;

    public ParserFacade(String file){
        try {
            ErrorHandler handler = new ErrorHandler(file);
            MicroLexer lexer = new MicroLexer(new ANTLRFileStream(file));
            lexer.removeErrorListeners();
            lexer.addErrorListener(handler);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            MicroParser parser = new MicroParser(commonTokenStream);
            parser.removeErrorListeners();
            parser.addErrorListener(handler);
            parser.setBuildParseTree(true);
            MicroParser.ProgramContext programContext = parser.program();
            listener = new ByteCodeListener();
            ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
            parseTreeWalker.walk(listener, programContext);
            this.file = file.substring(0, file.lastIndexOf('.'));
            //this.file = this.file.replace(".", "/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ParserFacade(InputStream inputStream, String file){
        try {
            ErrorHandler handler = new ErrorHandler(file);
            MicroLexer lexer = new MicroLexer(new ANTLRInputStream(inputStream));
            lexer.removeErrorListeners();
            lexer.addErrorListener(handler);
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            MicroParser parser = new MicroParser(commonTokenStream);
            parser.removeErrorListeners();
            parser.addErrorListener(handler);
            parser.setBuildParseTree(true);
            MicroParser.ProgramContext programContext = parser.program();
            listener = new ByteCodeListener();
            ParseTreeWalker parseTreeWalker = new ParseTreeWalker();
            parseTreeWalker.walk(listener, programContext);
            this.file = file.substring(0, file.lastIndexOf('.'));
            //this.file = this.file.replace(".", "/");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void generate(String dir){
        checkIfFileExists(dir + listener.module_name+".class");
        //String output = listener.module_name.replace(".", "/");
        listener.output( dir + listener.module_name+".class");
    }

    private static void checkIfFileExists(String s) {
        File f = new File(s);
        try{
            if(!f.getParentFile().exists()) f.getParentFile().mkdirs();
            if(!f.exists()) f.createNewFile();
        } catch(IOException e){
            Log.error("file_check", e.getMessage(), e);
        }
    }

}
