package io.micro.misc;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import io.micro.uni.Union;

import java.io.InputStream;
import java.io.OutputStream;

public class KBin {

    private static Kryo kryo;
    static {
        kryo = new Kryo();
        kryo.register(Union.class, 1);
    }

    public static void serialize(OutputStream os, Object obj){
        Output output = new Output(os);
        kryo.writeObject(output, obj);
        output.close();
    }

    public static <T> T deserialize(InputStream is, Class<T> clazz){
        Input input = new Input(is);
        T ret = kryo.readObject(input, clazz);
        input.close();
        return ret;
    }

}
