package com.liutao.desginpattern.Singleton;

/**
 * 枚举单例
 * Created by liutao on 17-2-21.
 */
public enum EnumSingleton {

    INSTANCE;

    public void doSomeWhile() {
        System.out.println("this is a enum singleton! ");
    }

    public String getResultCode() {
        return "0000";
    }
}
