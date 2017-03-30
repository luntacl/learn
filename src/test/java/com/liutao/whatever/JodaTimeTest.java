package com.liutao.whatever;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.junit.Test;

/**
 * Created by liutao on 2017/3/30.
 */
public class JodaTimeTest {

    @Test
    public void test1() {
        DateTime time = new DateTime();
        System.out.println(time);
//        String timeStr = "2016-03-30 17:53:23";
        System.out.println(time.toString("yyyy-MM-dd HH:mm:ss"));
        System.out.println(time.toDate());
        DateTime.Property property = DateTime.now().millisOfDay();
        System.out.println(property.get());
        boolean blank = StringUtils.isNotEmpty("  ");
        System.out.println(blank);
    }
}
