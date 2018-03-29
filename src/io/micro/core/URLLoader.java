package io.micro.core;

import io.micro.log.Log;
import sun.misc.IOUtils;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;

public class URLLoader {

    String TAG = "url_loader";
    ByteArrayInputStream byteArrayInputStream;

    URL url;
    public URLLoader(String url){
        try {
            this.url = new URL(url);
        } catch (MalformedURLException e) {
            Log.error(TAG, "The URL is malformed", e);
        }
    }

    public byte[] GET(){
        byte[] data = null;
        try {
            InputStream inputStream = url.openStream();
            byte[] buffer = new byte[0xffff];
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            for(int x = inputStream.read(buffer); x != -1; x = inputStream.read(buffer)){
                baos.write(buffer, 0, x);
            }
            baos.close();
            data = baos.toByteArray();
            inputStream.close();
        } catch (IOException e) {
            Log.error(TAG, "io_error", e);
        }
        return data;
    }

    public void RETREIVE(File file){
        try (FileOutputStream fos = new FileOutputStream(file)) {
            InputStream inputStream = url.openStream();
            byte[] buffer = new byte[0xffff];
            for(int len = inputStream.read(buffer); len != -1; len = inputStream.read(buffer)){
                fos.write(buffer, 0, len);
            }
        } catch (FileNotFoundException e) {
            Log.error(TAG, file.toString() + " could not be found!", e);
        } catch (IOException e) {
            Log.error(TAG, "io_error", e);
        }
    }

    public void load(){
        byte[] data = GET();
        byteArrayInputStream = new ByteArrayInputStream(data);
        Log.info(TAG, "Loaded " + url.toString());
    }

}
