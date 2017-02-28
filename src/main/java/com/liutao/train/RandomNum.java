package com.liutao.train;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liutao42
 * on 2017/2/28.
 */
public class RandomNum {

    public static List<Integer> getSomeRandomNum(int n) {
        int count = 0;
        List<Integer> numList = new ArrayList<Integer>();
        while (true) {
            int v = (int)(Math.random() * 100);
            if (numList.contains(v)) {
                continue;
            }
            numList.add(v);
            count++;
            if (count >= n) {
                break;
            }
        }
        return numList;
    }
}
