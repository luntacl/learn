package com.liutao.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by liutao on 17-1-17.
 */
public class MyInvocationHandler implements InvocationHandler{

    private Object target;
    public MyInvocationHandler(Object target) {
        this.target=target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method :"+ method.getName()+" is invoked!");
        return method.invoke(target,args);
    }
}
