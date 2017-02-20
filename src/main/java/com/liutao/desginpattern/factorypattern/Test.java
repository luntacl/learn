package com.liutao.desginpattern.factorypattern;

/**
 * Created by liutao on 17-2-16.
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory factory = new BroomFactory();
        Moveable m = factory.create();
        m.run();
    }
}
