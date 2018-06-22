package io.micro.misc;

import io.micrt.log.Log;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZCmpr {

    public static byte[] compress(byte[] uncompressed){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gzipOutputStream = new GZIPOutputStream(baos);
            gzipOutputStream.write(uncompressed, 0, uncompressed.length);
            gzipOutputStream.close();
            baos.close();
        } catch (IOException e) {
            Log.error("gzip", "io_error", e);
        }
        return baos.toByteArray();
    }

    public static byte[] decompress(byte[] compressed){
        ByteArrayInputStream bais = new ByteArrayInputStream(compressed);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (GZIPInputStream gzipInputStream = new GZIPInputStream(bais)) {
            byte[] buffer = new byte[0xffff];
            for(int len = gzipInputStream.read(buffer); len != -1; len = gzipInputStream.read(buffer)){
                baos.write(buffer, 0, len);
            }
            bais.close();
            baos.close();
        } catch (IOException e) {
            Log.error("gzip", "io_error", e);
        }
        return baos.toByteArray();
    }

}
