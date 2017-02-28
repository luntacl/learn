package com.liutao.train;

import org.junit.Test;

import java.util.List;

/**
 * Created by liutao42
 * on 2017/2/28.
 */
public class RandomNumTest {
    @Test
    public void test() {
        List<Integer> randomNum = RandomNum.getSomeRandomNum(20);
        System.out.print(randomNum.toString());
    }
}
