package com.liutao.proxy.jdk;

import com.liutao.proxy.HelloWrold;
import com.liutao.proxy.impl.HelloworldImpl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * Created by liutao on 17-1-17.
 */
public class JDKProxyTest {
    public static void main(String[]args) throws NoSuchMethodException ,
            IllegalAccessException, InvocationTargetException, InstantiationException {
        //这里有两种写法，我们采用略微复杂的一种写法，这样更有助于大家理解。
        Class<?> proxyClass= Proxy.getProxyClass(JDKProxyTest.class.getClassLoader(),HelloWrold.class);
        final Constructor<?> cons = proxyClass.getConstructor(InvocationHandler.class);
        final InvocationHandler ih = new MyInvocationHandler(new HelloworldImpl());
        HelloWrold helloWorld= (HelloWrold) cons.newInstance(ih);
        helloWorld.sayHello();

        //下面是更简单的一种写法，本质上和上面是一样的
        /*
        HelloWorld helloWorld=(HelloWorld)Proxy.
                 newProxyInstance(JDKProxyTest.class.getClassLoader(),
                        new Class<?>[]{HelloWorld.class},
                        new MyInvocationHandler(new HelloworldImpl()));
        helloWorld.sayHello();
        */
    }
}
