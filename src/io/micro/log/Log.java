package io.micro.log;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Log {

    static Timer TIMER = new Timer();
    public static PrintStream output = System.out;

    public static void resetTimer(){
        TIMER = new Timer();
    }

    enum Level {
        DEBUG("DEBUG"),
        TRACE("TRACE"),
        INFO("INFO"),
        ERROR("ERROR"),
        NULL("*");

        final String out;

        Level(String print){
            this.out = print;
        }
    }

    public static void log(String category, Level lvl, String msg){
        String hms = TIMER.getDiffFormatted();
        output.println(hms + "/"+ lvl.out +": [" + category + "] " + msg);
    }

    private static String getStackTrace(Throwable t){
        StringWriter writer = new StringWriter();
        PrintWriter printWriter = new PrintWriter(writer);
        t.printStackTrace(printWriter);
        String ret = writer.toString();
        try {
            writer.close();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ret;
    }

    public static void debug(String category, String msg, Throwable t){
        log(category, Level.DEBUG, msg + System.lineSeparator() + getStackTrace(t));
    }

    public static void trace(String category, String msg, Throwable t){
        log(category, Level.TRACE, msg + System.lineSeparator() + getStackTrace(t));
    }

    public static void debug(String category, String msg){
        log(category, Level.DEBUG, msg);
    }

    public static void error(String category, String msg, Throwable t){
        log(category, Level.ERROR, msg + System.lineSeparator() + getStackTrace(t));
    }

    public static void error(String category, String msg){
        log(category, Level.ERROR, msg);
    }

    public static void trace(String category, String msg){
        log(category, Level.TRACE, msg);
    }

    public static void info(String category, String msg){
        log(category, Level.INFO, msg);
    }

}
