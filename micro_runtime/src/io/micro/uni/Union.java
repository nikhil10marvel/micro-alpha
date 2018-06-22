package io.micro.uni;

import io.micro.misc.GZCmpr;
import io.micro.misc.KBin;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class Union {

    volatile UnionDef udef;
    private HashMap<String, Object> value = new HashMap<>();
    private ArrayList<String> constants_set = new ArrayList<>();


    Union(UnionDef udef){
        this.udef = udef;
    }

    public void val(String name, Object value){
        if(udef.isConstant(name) && !constants_set.contains(name) && udef.lookup(name)){
            constants_set.add(name);
            this.value.put(name, value);
        } else if (udef.lookup(name)){
            this.value.put(name, value);
        }
    }

    public static Union create(UnionDef udef){
        Union uni = new Union(udef);
        return uni;
    }

    public static byte[] bin(Union union){
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        KBin.serialize(baos, union);
        return baos.toByteArray();
    }

    public static byte[] bin_cmpr(Union union){
        byte[] data = bin(union);
        return GZCmpr.compress(data);
    }

    public static Union create(byte[] data, UnionDef udef){
        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        Union union = KBin.deserialize(bais, Union.class);
        union.udef = udef;
        return union;
    }

    public static Union create_dcmpr(byte[] cmpr, UnionDef udef){
        byte[] data = GZCmpr.decompress(cmpr);
        return create(data, udef);
    }

    public Object get(String name){
        if(udef.lookup(name)){
            return this.value.get(name);
        } else {
            return null;
        }
    }

}
