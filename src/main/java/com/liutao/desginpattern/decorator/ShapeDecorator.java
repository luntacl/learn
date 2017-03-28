package com.liutao.desginpattern.decorator;

/**
 * Created by liutao42
 * on 2017/3/7.
 */
public  abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
