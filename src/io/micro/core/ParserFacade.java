package io.micro.core;

import io.micro.antlr.MicroLexer;
import io.micro.antlr.MicroParser;
import javassist.ClassPool;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.InputStream;

public class ParserFacade implements Facade{

    private String file;
    ByteCodeListener listener;

    public ParserFacade(String file){
        try {
            MicroLexer lexer = new MicroLexer(new ANTLRFileStream(file));
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            MicroParser parser = new MicroParser(commonTokenStream);
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

    public ParserFacade(InputStream inputStream){
        try {
            MicroLexer lexer = new MicroLexer(new ANTLRInputStream(inputStream));
            CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
            MicroParser parser = new MicroParser(commonTokenStream);
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

    public void generate(){
        //String output = listener.module_name.replace(".", "/");
        listener.output(listener.module_name+".class");
    }

}
