package com.example.demo.core.util;

import javafx.print.Collation;

import java.util.Collection;

public final class CollectionUtils {

    public static  final String LIST_SEPERATOR=",";

    /**
     * 将一个集合用指定分隔符连接为一个字符串
     * @param c
     * @param seperator
     * @return
     */
    public static String join(Collection<? extends Object> c ,String seperator){
        StringBuffer buf = new StringBuffer();
        if(!isEmpty(c)){
            for (Object o :c){
                buf.append(seperator).append(o.toString());
            }
            if(buf.length()>0){
                buf.delete(0,seperator.length());
            }
        }
        return buf.toString();
    }

    public static boolean isEmpty(Collection<?> c) {
        return c==null || c.isEmpty();
    }

    /**
     * 将一个集合默认用,作为分割符
     * @param c
     * @return
     */
    public static String join(Collection<? extends Object> c ){
        return join(c,LIST_SEPERATOR);
    }
}
