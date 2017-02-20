package com.liutao.designpattern.observerpattern;

import com.liutao.desginpattern.observerpattern.example_b.SubscriptionSubject;
import com.liutao.desginpattern.observerpattern.example_b.WeiXinObserver;
import org.junit.Test;

/**
 * Created by liutao on 17-2-19.
 */
public class observerPatternTest {
    @Test
    public void test() {
        SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
        //创建微信用户
        WeiXinObserver weiXinObserver1 = new WeiXinObserver("小王");
        WeiXinObserver weiXinObserver2 = new WeiXinObserver("小张");
        WeiXinObserver weiXinObserver3 = new WeiXinObserver("小李");
        WeiXinObserver weiXinObserver4 = new WeiXinObserver("小刘");
        //用户订阅公众号
        subscriptionSubject.attach(weiXinObserver1);
        subscriptionSubject.attach(weiXinObserver2);
        subscriptionSubject.attach(weiXinObserver3);
        subscriptionSubject.attach(weiXinObserver4);
        //公众号发布消息
        subscriptionSubject.notify("新年好！");
    }

}
