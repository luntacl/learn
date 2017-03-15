package com.liutao.desginpattern.decorator;

/**
 * Created by liutao42
 * on 2017/3/7.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        redRectangle.draw();
    }
}
