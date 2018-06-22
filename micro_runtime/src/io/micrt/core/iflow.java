package io.micrt.core;

import io.micro.uni.Union;
import io.micro.uni.UnionDef;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class iflow {

    static final UnionDef udef;

    static {
        udef = new UnionDef();
        udef.register("data", false);
        udef.register("off", false);
        udef.register("meta", true);
    }

    private static Union createFlow(byte[] data, int start_off){
        Union union = Union.create(udef);
        union.val("data", data);
        union.val("off", start_off);
        return union;
    }

    private static byte[] getData(Union union){
        return (byte[]) union.get("data");
    }

    private static int getOffset(Union union){
        return (int) union.get("off");
    }

    private static <T> T getMeta(Union uni, Class<T> metaclass){
        return metaclass.cast(uni.get("meta"));
    }

    public static Union create(byte[] data){
        return createFlow(data, 0);
    }

    public static Union create_f(String file){
        Union uni = Union.create(udef);
        uni.val("data", file);
        uni.val("off", 0);
        return uni;
    }

    public static byte[] read(Union uni, int length){
        uni.val("off", getOffset(uni) + length);
        return Arrays.copyOfRange(getData(uni), getOffset(uni) - length, length);
    }

    public static int read(Union uni){
        uni.val("off", getOffset(uni) + 1);
        return getData(uni)[getOffset(uni)-1];
    }

    public static int read_f(Union uni) throws IOException {
        if(getMeta(uni, BufferedReader.class) == null){
            uni.val("meta", Files.newBufferedReader(Paths.get((String)uni.get("data"))));
        }
        return getMeta(uni, BufferedReader.class).read();
    }

    public static String read_fl(Union uni) throws IOException {
        if(getMeta(uni, BufferedReader.class) == null){
            uni.val("meta", Files.newBufferedReader(Paths.get((String)uni.get("data"))));
        }
        return getMeta(uni, BufferedReader.class).readLine();
    }

    public static void write_f(Union uni, String string) throws IOException {
        if(getMeta(uni, BufferedWriter.class) == null){
            uni.val("meta", Files.newBufferedWriter(Paths.get((String)uni.get("data"))));
        }
        getMeta(uni, BufferedWriter.class).write(string);
    }

    public static void flush_f(Union uni) throws IOException {
        if(getMeta(uni, BufferedWriter.class) == null){
            throw new IllegalStateException("Cannot flush a closed writer");
        } else {
            getMeta(uni, BufferedWriter.class).flush();
        }
    }

    public static void close_f(Union uni) throws IOException {
        if(getMeta(uni, BufferedWriter.class) != null){
            getMeta(uni, BufferedWriter.class).close();
        }
    }
}
