package io.micro.core;

import javassist.ClassPool;

import java.util.ArrayList;

public class ParserPool{

    public static ClassPool cp = ClassPool.getDefault();
    static ArrayList<Facade> list = new ArrayList<>();

    public static ParserFacade program(String file){
        ParserFacade parserFacade = new ParserFacade(file);
        list.add(parserFacade);
        return parserFacade;
    }

    public static ParserFacade program(URLLoader loader){
        ParserFacade parserFacade = new ParserFacade(loader.byteArrayInputStream);
        list.add(parserFacade);
        return parserFacade;
    }

    public static void generate(){
        list.forEach(Facade::generate);
    }

}
