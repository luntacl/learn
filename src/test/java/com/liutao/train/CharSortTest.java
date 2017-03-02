package com.liutao.train;

import org.junit.Test;

/**
 * Created by liutao on 17-2-27.
 */
public class CharSortTest {
    @Test
    public void test(){
        String a="fser345dferi880";
//        String str = CharSort.StrSort(a);
        String str = CharSort.StrSort2(a);
        System.out.println(str);
    }
}
