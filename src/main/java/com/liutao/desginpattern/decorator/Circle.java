package com.liutao.desginpattern.decorator;

/**
 * Created by liutao42
 * on 2017/3/7.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
