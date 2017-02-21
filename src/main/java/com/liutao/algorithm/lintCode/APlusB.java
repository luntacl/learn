package com.liutao.algorithm.lintCode;

/**
 * Created by liutao42
 * on 2017/2/21.
 */
public class APlusB {
    /**
     * 给出两个整数a和b, 求他们的和, 但不能使用 + 等数学运算符。
     */
    public static int aPlusb(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        int x1 = a ^ b;
        int x2 = (a & b) << 1;
        return aPlusb(x1, x2);
    }
}
