package com.liutao.desginpattern.decorator;

/**
 * Created by liutao42
 * on 2017/3/7.
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);

    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
