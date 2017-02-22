package com.liutao.proxy.impl;

import com.liutao.proxy.BookFacade;

/**
 * Created by liutao on 17-2-22.
 */
public class BookFacadeImpl implements BookFacade {

    @Override
    public void addBook() {
        System.out.println("增加图书方法。");
    }
}
