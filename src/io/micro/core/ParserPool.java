package io.micro.core;

import io.micro.log.Log;
import javassist.ClassPool;
import javassist.NotFoundException;
import javassist.URLClassPath;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class ParserPool{

    public static ClassPool cp = ClassPool.getDefault();
    static ArrayList<Facade> list = new ArrayList<>();
    private static String OUTPUT_DIR;
    private static String SOURCE_DIR = "";

    static {
//        Log.debug("parser_pool", "user.dir: " + System.getProperty("user.dir"));
        setOutputDir(System.getProperty("user.dir"));
    }

    public static void init(){
        String odir = Main.settings.get("output_dir");
        if(odir != null) setOutputDir(odir);
        String ext_class = Main.settings.getOrDefault("ext.class", "");
        if(!ext_class.isEmpty()) forceCP(ext_class);
        String jar_dir = Main.settings.getOrDefault("jars.dir", "");
        if(!jar_dir.isEmpty()) forceDir(new File(jar_dir));
        setSourceDir(Main.settings.getOrDefault("src.dir", ""));
    }

    private static void forceDir(File jar_dir){
        File[] sub_files = jar_dir.listFiles();
        for(File sub_file : Objects.requireNonNull(sub_files)){
            if(sub_file.isDirectory()){
                forceDir(sub_file);
            } else if(sub_file.getAbsolutePath().endsWith(".jar")){
                forceCP(getCanonical(sub_file));
            }
        }
    }

    private static void forceCP(String path){
        try {
            cp.insertClassPath(path);
        } catch (NotFoundException e) {
            Log.error(ParserPool.class.getCanonicalName(), e.getLocalizedMessage(), e);
        }
    }

    private static void setOutputDir(String outputDir) {
        if(!outputDir.isEmpty()){
            if(!outputDir.endsWith(File.separator)){
                OUTPUT_DIR = outputDir + File.separator;
            } else {
                OUTPUT_DIR = outputDir;
            }
        }
        File test = new File(OUTPUT_DIR);
        if(!test.exists()) test.mkdirs();
    }

    private static void setSourceDir(String sourceDir) {
        if(!sourceDir.isEmpty()){
            if(!sourceDir.endsWith(File.separator)){
                SOURCE_DIR = sourceDir + File.separator;
            } else {
                SOURCE_DIR = sourceDir;
            }
            File test = new File(SOURCE_DIR);
            if(!test.exists()) test.mkdirs();
        }
    }

    public static ParserFacade program(String file){
        ParserFacade parserFacade = new ParserFacade(SOURCE_DIR + file);
        list.add(parserFacade);
        return parserFacade;
    }

    public static void insertJAR(String path){
        try {
            cp.insertClassPath(path + ".jar");
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void insertNetworkedRepository(String url, String package_name){
        String host = url.substring(0, url.lastIndexOf(":"));
        String base_dir = url.substring(url.lastIndexOf("/"), url.length());
        int port = Integer.parseInt(url.substring(url.lastIndexOf(":"), url.length()));
        Log.debug("parser_pool", "host :" + host + " port :" + port + " package_name :" + package_name);
//        URLClassPath urlClassPath = new URLClassPath(host, port, base_dir, package_name);
    }

    public static ParserFacade program(URLLoader loader){
        ParserFacade parserFacade = new ParserFacade(loader.byteArrayInputStream, loader.url.toString());
        list.add(parserFacade);
        return parserFacade;
    }

    public static void generate(){
        list.forEach(facade -> facade.generate(OUTPUT_DIR));
    }

    public static String getCanonical(String path){
        File file = new File(path);
        return getCanonical(file);
    }

    public static String getCanonical(File file){
        String ret = null;
        try {
            ret = file.getCanonicalPath();
        } catch (IOException e) {
            Log.error("parser_pool", e.getMessage(), e);
        }
        return ret;
    }

}
