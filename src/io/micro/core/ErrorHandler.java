package io.micro.core;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.io.PrintStream;

public class ErrorHandler extends BaseErrorListener{

    public static boolean offtok = false;

    PrintStream stream = System.out;
    public ErrorHandler(String filename) {
        this.filename = filename;
    }

    private String filename;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        stream.println("["+ filename + "] " + msg + " line " + line + ":" + charPositionInLine);
        if(offtok) stream.println("offending token:" + e.getOffendingToken());
    }
}
