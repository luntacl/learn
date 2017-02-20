package com.liutao.proxy.impl;

import com.liutao.proxy.HelloWrold;

/**
 * Created by liutao on 17-1-17.
 */
public class HelloworldImpl implements HelloWrold {
    @Override
    public void sayHello() {
        System.out.println("Hello World!");
    }
}
