package io.micro.uni;

import java.util.HashMap;

public class UnionDef extends HashMap<String, Boolean> {

    public void register(String name, boolean constNA){
        putIfAbsent(name, constNA);
    }

    protected boolean lookup(String name){
        return keySet().contains(name);
    }

    protected boolean isConstant(String name){
        return getOrDefault(name, false);
    }
}
