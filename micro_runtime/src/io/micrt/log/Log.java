package io.micrt.log;

import java.io.*;
import java.util.ArrayList;

public class Log {

    static Timer TIMER = new Timer();
    public static PrintStream output = System.out;
    static ArrayList<PrintWriter> output_writers = new ArrayList<>();

    public static void resetTimer(){
        TIMER = new Timer();
    }

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(() -> output_writers.forEach(PrintWriter::close)));
    }

    enum Level {
        DEBUG("DEBUG", 1),
        TRACE("TRACE", 2),
        INFO("INFO"  , 3),
        ERROR("ERROR", 4),
        FATAL("FATAL", 5),
        NULL("*"     , 0);

        final String out;
        final int id;

        Level(String print, int id){
            this.out = print;
            this.id = id;
        }
    }

    private static int outputLevel, writeLevel;

    public static void setOutputLevel(Level lvl){
        outputLevel = lvl.id;
    }

    public static void setWriteLevel(Level lvl){
        writeLevel = lvl.id;
    }

    public static void file_handle(String file, boolean append){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, append);
            PrintWriter printWriter = new PrintWriter(fileOutputStream);
            output_writers.add(printWriter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void log(String category, Level lvl, String msg){
        String hms = TIMER.getDiffFormatted();
        if(lvl.id >= outputLevel) output.println(hms + "/"+ lvl.out +": [" + category + "] " + msg);
        if(lvl.id >= writeLevel) output_writers.forEach(writer -> writer.println(msg));
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

    public static void fatal(String category, String msg, Throwable t){
        log(category, Level.FATAL, msg + System.lineSeparator() + getStackTrace(t));
    }

    public static void fatal(String category, Throwable t){
        log(category, Level.FATAL, t.getLocalizedMessage() + System.lineSeparator() + getStackTrace(t));
    }

}
