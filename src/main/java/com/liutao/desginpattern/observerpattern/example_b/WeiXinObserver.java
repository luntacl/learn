package com.liutao.desginpattern.observerpattern.example_b;

/**
 * 假设这是微信公众号的订阅用户
 * Created by liutao on 17-2-19.
 */
public class WeiXinObserver extends Observer {

    private String name;

    public WeiXinObserver(String name) {
        this.name = name;
    }
    @Override
    public void update(String message) {
        System.out.println(name+" : "+message);
    }
}
