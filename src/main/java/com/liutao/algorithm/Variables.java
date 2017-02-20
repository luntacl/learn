package com.liutao.algorithm;

/**
 * Created by liutao on 17-2-18.
 */
public class Variables {
    /**
     * 不使用中间变量，交换两个变量的值
     * @param a
     * @param b
     */
    public static void switch2Varables(int a,int b){
        System.out.println("switch before! a = "+a+" and b = "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("switch after! a = "+a+" and b = "+b);
    }

    /**
     * 字符串倒序
     * @param a
     */
    public static String reverseVariable(String a){
        char[] chars = a.toCharArray();
        char t;
        int length = chars.length;
        for (int i=0;i<length/2;i++) {
            t= chars[i];
            chars[i] = chars[length-1-i];
            chars[length-1-i] = t;
        }
        return String.valueOf(chars);
    }
}
