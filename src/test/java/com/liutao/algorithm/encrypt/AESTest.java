package com.liutao.algorithm.encrypt;

import org.junit.Test;

/**
 * Created by liutao on 17-3-28.
 */
public class AESTest {
    @Test
    public void AestEnryptTest() throws Exception {
        String content = "hello world";
        String key = "1234567890abcdef1234567890abcdef";
        String encrypt = AESUtil.encrypt(content, key);
        System.out.print(encrypt);
    }
}
