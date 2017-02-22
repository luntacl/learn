package com.liutao.proxy;

import com.liutao.proxy.cglib.BookFacadeCglib;
import com.liutao.proxy.jdk.BookFacadeProxy;
import com.liutao.proxy.impl.BookFacadeImpl;
import org.junit.Test;

/**
 * 详见：http://www.cnblogs.com/jqyp/archive/2010/08/20/1805041.html
 * Created by liutao on 17-2-22.
 */
public class ProxyTest {

    @Test
    public void JdkProxyTest() {
        BookFacadeProxy proxy = new BookFacadeProxy();
        BookFacade bookProxy = (BookFacade) proxy.bind(new BookFacadeImpl());
        bookProxy.addBook();
    }

    @Test
    public void cglibProxyTest() {
        BookFacadeCglib cglib = new BookFacadeCglib();
        BookFacadeImpl bookProxy = (BookFacadeImpl) cglib.getInstance(new BookFacadeImpl());
        bookProxy.addBook();
    }
}
