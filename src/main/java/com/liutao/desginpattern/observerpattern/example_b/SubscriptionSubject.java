package com.liutao.desginpattern.observerpattern.example_b;

import java.util.ArrayList;
import java.util.List;

/**
 * 假设这是一个微信公众号
 * Created by liutao on 17-2-19.
 */
public class SubscriptionSubject implements Subject {

   private List<Observer> WeiXinObserverList  = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        WeiXinObserverList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        WeiXinObserverList.remove(observer);
    }

    @Override
    public void notify(String message) {
        for (Observer observer : WeiXinObserverList) {
            observer.update(message);
        }
    }
}
