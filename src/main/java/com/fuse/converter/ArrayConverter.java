package com.fuse.converter;

import com.fuse.bean.MyArray;
import org.apache.camel.Converter;

import java.util.Vector;

@Converter
public class ArrayConverter {

    @Converter
    public static Vector<String> toVector(MyArray aList) {
        return new Vector<String>(aList);
    }
}
