package com.liutao.whatever;

import org.junit.Test;

/**
 * Created by liutao42
 * on 2017/3/3.
 */
public class Equals {
    @Test
    public void test() {

        int n = 3;
        int m = 3;
        System.out.println("n == m:"+(n == m));

        Integer a = new Integer(3);
        Integer b = new Integer(3);
        System.out.println("a==b:"+(a==b));

        String str = new String("hello");
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("str1 == str2:"+(str1 == str2));

        str1 = str;
        str2 = str;
        System.out.println(str1 == str2);
    }

    @Test
    public void test2() {
        byte[] bytes = new byte[4];
        String s = new String(bytes);

    }
}
