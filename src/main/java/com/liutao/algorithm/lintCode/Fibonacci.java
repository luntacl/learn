package com.liutao.algorithm.lintCode;

/**
 * Created by liutao42
 * on 2017/3/1.
 */
public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n-2)+fibonacci(n-1);
    }
}
