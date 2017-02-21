package com.liutao.designpattern.observerpattern;

import com.liutao.desginpattern.Singleton.EnumSingleton;
import org.junit.Test;

/**
 * Created by liutao on 17-2-21.
 */
public class SingletonTest {

    @Test
    public void test() {
        EnumSingleton.INSTANCE.doSomeWhile();
        System.out.println(EnumSingleton.INSTANCE.getResultCode());
    }
}
