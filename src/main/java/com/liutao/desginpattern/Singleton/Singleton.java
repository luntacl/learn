package com.liutao.desginpattern.Singleton;

/**
 * Created by liutao on 17-2-16.
 */

/**
 * 懒汉模式，非线程安全
 */
public class Singleton {
    private static Singleton instance;
    private Singleton(){}

    public static Singleton getInstance() {
        if (instance==null) {
            instance = new Singleton();
        }
        return instance;
    }
}


/*public class DoubleLockSingleton {
    private static DoubleLockSingleton instance;
    private DoubleLockSingleton (){}
    public static DoubleLockSingleton getInstance(){
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null) {
                    instance = new DoubleLockSingleton();
                }
            }
        }
        return instance;
    }

}*/
