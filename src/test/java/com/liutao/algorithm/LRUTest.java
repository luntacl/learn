package com.liutao.algorithm;

import org.junit.Test;

/**
 * Created by liutao on 17-2-19.
 */
public class LRUTest {
    @Test
    public void test() {
        LRU lru = new LRU();
        Integer iter[] = {4,7,0,7,1,0,1,2,1,2,6};
        for (int i=0;i<iter.length;i++) {
            lru.push(iter[i]);
            lru.showMemoryBlock();
            System.out.println();
        }
    }
}
