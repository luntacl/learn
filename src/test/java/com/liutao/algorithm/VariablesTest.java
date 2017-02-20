package com.liutao.algorithm;

import org.junit.Test;

/**
 * Created by liutao on 17-2-18.
 */

public class VariablesTest {
    /**
     * 不使用中间变量，交换两个变量的值
     */
    @Test
    public void test(){
        Variables.switch2Varables(4,5);
    }

    /**
     * 字符串倒序
     */
    @Test
    public void reverseTest(){
        String Str = Variables.reverseVariable("abcde");
        System.out.println(Str);
    }
}
