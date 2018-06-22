package io.micro.core;

import io.micro.log.Log;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.Properties;

import static io.micro.core.ParserPool.getCanonical;

public class Configuration {

    private static final String BIN_OUTPUT = "bin";
    private static final String LIB_DIR = "lib";
    private static final String LIB_JARS = "jars";
    private static final String LIB_NATIVES = "natives";
    private static final String SOURCE_DIR = "src";
    private static String EXT = ".sh";
    private static String ALLARG;

    static {
        if(System.getProperty("os.name").toLowerCase().startsWith("win")){
            EXT = ".bat";
            ALLARG = " %*";
        } else {
            EXT = ".sh";
            ALLARG = " \"$@\"";
        }
    }

    public static void load_config(String file) throws IOException {
        Properties properties = new Properties();
        FileReader fileReader = new FileReader(file);
        properties.load(fileReader);
        Enumeration enumeration = properties.propertyNames();
        while(enumeration.hasMoreElements()){
            String property = (String) enumeration.nextElement();
            String value = properties.getProperty(property);
            Main.settings.putIfAbsent(property, value);
        }
        fileReader.close();
    }

    public static void createProject(String project_name, String compiler_location, String runtime_location, String  mainfile, String module_name) throws IOException {
        Log.info(Configuration.class.getSimpleName(),"Generating Project " + project_name);
        File odir = mkdir(project_name + File.separator + BIN_OUTPUT);
        Log.info(Configuration.class.getSimpleName(),"Created Output Directory");
        File jdir = mkdir(project_name + File.separator + LIB_DIR + File.separator + LIB_JARS);
        mkdir(project_name + File.separator + LIB_DIR + File.separator + LIB_NATIVES);
        Log.info(Configuration.class.getSimpleName(),"Created Lib Directory");
        File sdir = mkdir(project_name + File.separator + SOURCE_DIR);
        Log.info(Configuration.class.getSimpleName(),"Created Source Directory");

        String config = "output_dir=" + getCanonical(odir) + System.lineSeparator() +
                "jars.dir=" + getCanonical(jdir) + System.lineSeparator() +
                "src.dir=" + getCanonical(sdir);

        Log.info(Configuration.class.getSimpleName(),"Generating Settings/Config file!");
        Files.write(Paths.get(project_name + File.separator + "settings.cfg"), config.getBytes());
        mkfile(getCanonical(sdir) + File.separator + mainfile);
        Log.info(Configuration.class.getTypeName(), "Preparing scripts....");
        String cnn_rt_loc = getCanonical(runtime_location);
        String compile_cmd = "java -jar " + getCanonical(compiler_location) + " -lcfg " + "." + File.separator + "settings.cfg" + " -rt " + cnn_rt_loc.substring(0, cnn_rt_loc.length()-4) + " -mc " + mainfile;
        Files.write(Paths.get(project_name + File.separator + "minc" + EXT), compile_cmd.getBytes());
        String run_cmd = "java -cp " + getCanonical(runtime_location) + File.pathSeparator + "." + File.separator + LIB_DIR + File.separator+ LIB_JARS + File.pathSeparator + "." + File.separator + BIN_OUTPUT + File.pathSeparator + " " + module_name + ALLARG;
        Files.write(Paths.get(project_name + File.separator + "minr" + EXT), run_cmd.getBytes());
    }

    private static void mkfile(String s) throws IOException {
        File f = new File(s);
        if(!f.exists()) f.createNewFile();
    }

    private static File mkdir(String file){
        File f = new File(file);
        f.mkdirs();
        return f;
    }

}
