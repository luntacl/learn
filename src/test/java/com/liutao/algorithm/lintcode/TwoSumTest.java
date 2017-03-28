package com.liutao.algorithm.lintcode;

import com.liutao.algorithm.lintCode.TwoSum;
import org.junit.Test;

/**
 * Created by liutao42
 * on 2017/3/15.
 */
public class TwoSumTest {

    @Test
    public void test() {
        int a[]={2,7,5,8};
        int[] ints = TwoSum.twoSum(a, 9);
        System.out.print(ints[0]+","+ints[1]);
    }
}
