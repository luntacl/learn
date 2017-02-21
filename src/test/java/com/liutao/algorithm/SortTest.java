package com.liutao.algorithm;

import com.liutao.algorithm.lintCode.Sort;
import org.junit.Test;

/**
 * Created by liutao42
 * on 2017/2/21.
 */
public class SortTest {
    @Test
    public void test() {
        int array[] = {4,2,21,34,1,5,7};
        Sort.shellSort(array);
        for (int i= 0;i<array.length;i++) {
            System.out.print(array[i]+"  ");
        }
    }

    @Test
    public void test1() {
        String a = "abc";
        String b = "abc";
        Integer c = 2;
        Integer d = 2;
        System.out.println(a == b);
        System.out.print(c == d);
    }
}
