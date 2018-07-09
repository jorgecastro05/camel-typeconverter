package com.fuse.converter;

import com.fuse.bean.MyArray;
import org.apache.camel.Converter;
import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.support.TypeConverterSupport;

import java.util.Vector;

@Converter
public class ArrayConverter extends TypeConverterSupport {

    /*
    public static Vector<String> toVector(ArrayList<String> aList) {
         return new Vector<String>(aList);
     */
    @Override
    public <T> T convertTo(Class<T> aClass, Exchange exchange, Object o) throws TypeConversionException {
        MyArray obj = (MyArray) o;
        Vector<String> result = new Vector<>(obj);
        return (T) result;
    }
}
