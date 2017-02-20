package com.liutao.desginpattern.factorypattern;

/**
 * Created by liutao on 17-2-16.
 */
public class BroomFactory extends AbstractFactory {
    public Moveable create(){
        return new Broom();
    }
}
