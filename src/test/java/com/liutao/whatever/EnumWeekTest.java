package com.liutao.whatever;

import org.junit.Test;

/**
 * Created by liutao on 17-2-21.
 */
public class EnumWeekTest {
    @Test
    public void test() {
        int fri = Week.FRI.getValue();
        System.out.println("Week.FRI 的 value: "+fri);
        System.out.println(Week.FRI.isRest());
        System.out.println(Week.SUN.isRest());
    }

}
