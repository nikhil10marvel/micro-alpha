package io.micro.core;

import io.micro.log.Log;
import org.apache.commons.cli.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class Main {

    static Options options = new Options();
    static HashMap<String, String> settings = new HashMap<>();

    static {
        options.addOption("rt", "runtime-libs", true, "The path to runtime jar");
//        options.addOption("pr", "project",true,"Creates a micro project in the specified folder");
        options.addOption("mc", "compile", true,"Compile the given file");
        options.addOption("lcfg", "load-config", true, "Load configuration from a file");
        options.addOption("sot", "show-offending-token", false,"Shows the offending tokens if there is a compilation error");

        Option project = Option.builder("pr").longOpt("project").hasArgs().numberOfArgs(5).argName("project name> <compiler location> <runtime location> <main file> <main module name").desc("Creates a micro project").build();
        options.addOption(project);
        Option nlib = Option.builder("nlib").longOpt("net-repo").hasArgs().numberOfArgs(2).argName("url> <base package").desc("Classes will be included from the url and base package mentioned").build();
        options.addOption(nlib);
        Option config = Option.builder("C").argName("property=value").hasArgs().valueSeparator().desc("set a configuration property").build();
        options.addOption(config);
    }

    public static void main(String[] args) {
        /*ParserPool.program(args[0]);
        ParserPool.generate();*/
        if (args.length > 0) {
            try {
                CommandLineParser commandLineParser = new DefaultParser();
                CommandLine commandLine = commandLineParser.parse(options, args);
                Iterator<Option> options_i = commandLine.iterator();
                while(options_i.hasNext()){
                    Option cur_option = options_i.next();
                    switch (cur_option.getOpt()) {
                        case "C":
                            String[] config = cur_option.getValues();
                            settings.put(config[0], config[1]);
                            break;
                        case "nlib":
                            String[] url_package = cur_option.getValues();
                            ParserPool.insertNetworkedRepository(url_package[0], url_package[1]);
                            break;
                        case "rt":
                            ParserPool.insertJAR(cur_option.getValue());
                            break;
                    }
                }
                if(commandLine.hasOption("lcfg")){
                    Configuration.load_config(commandLine.getOptionValue("lcfg"));
                }
                if(commandLine.hasOption("sot")){
                    ErrorHandler.offtok = true;
                }
                ParserPool.init();
                if(commandLine.hasOption("mc")){
                    ParserPool.program(commandLine.getOptionValue("mc"));
                    ParserPool.generate();
                }
                if(commandLine.hasOption("pr")){
                    String[] prm = commandLine.getOptionValues("pr");
                    Configuration.createProject(prm[0], prm[1], prm[2], prm[3], prm[4]);
                }
            } catch (ParseException e) {
                showHelp();
                Log.error(Main.class.getCanonicalName(), e.getMessage(), e);
            } catch (IOException e) {
                Log.error(Main.class.getCanonicalName(), e.getMessage(), e);
            }
        } else {
            showHelp();
        }
    }

    public static void showHelp(){
        HelpFormatter helpFormatter = new HelpFormatter();
        helpFormatter.printHelp("micro-compiler", options);
    }
}
