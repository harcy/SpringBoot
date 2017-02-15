package com.sap.other;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by I337300 on 2/10/2017.
 */
public class TestStatic {


    public static void main(String[] args) throws NoSuchFieldException {
        //String s = new String();
        /*String s = new String("hello");
        Class clazz = s.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field:fields
             ) {
            System.out.println(field.toString());
        }*/
        /*String s = new String("abcde");
        int i = s.codePointCount(1,3);
        System.out.println(i);
        byte[] bytes = s.getBytes();
        for (byte b:bytes
             ) {
            System.out.println(b);
        }
        char[] chars = new char[]{'h','e','l','l','o'};
        String s1 = new String(chars, 3, 2);
        System.out.println(s1);*/
        String s = "helloworld";
        boolean b = s.regionMatches(0, "hello", 0, 5);
        System.out.println(b);
        String s1 = "ch";
        System.out.println(s1.hashCode());
        System.out.println(s.indexOf("worl"));
        //ArrayList
    }

    /*InnerTestStatic innerTestStatic = new InnerTestStatic();

    private String[] strs = {"hello", "wolrd", "etc"};
    private String strs2[] = {"12", "34"};

    private void testHello() {
        innerTestStatic.hello();
        this.strs.length;
        this.strs2.length
    }
    private static class InnerTestStatic {
        private void hello() {
            System.out.println("hello");
        }
    }*/

}
