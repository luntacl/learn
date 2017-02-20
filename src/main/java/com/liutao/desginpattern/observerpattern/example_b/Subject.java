package com.liutao.desginpattern.observerpattern.example_b;

/**
 * Created by liutao on 17-2-19.
 */
public interface Subject {

    /**
     * 增加订阅者
     * @param observer
     */
    public void attach(Observer observer);

    /**
     * 删除订阅者
     * @param observer
     */
    public void detach(Observer observer);

    /**
     * 通知订阅者更新
     * @param message
     */
    public void notify(String message);
}
