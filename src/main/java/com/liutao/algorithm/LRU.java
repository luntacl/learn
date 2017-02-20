package com.liutao.algorithm;

/**
 * 最近最少使用算法的实现
 * Created by liutao on 17-2-19.
 */
public class LRU {
    //内存块数
    private int MEM_BLOCK_SIZE;
    private static final int SIZE = 5;
    //内存块数组
    Object[] array;

    private int size;

    public LRU() {
        this.MEM_BLOCK_SIZE =SIZE;
        this.array = new Object[SIZE];
    }
    public LRU(int blockSize){
        this.MEM_BLOCK_SIZE = blockSize;
        this.array = new Object[MEM_BLOCK_SIZE];
    }

    /**
     * 判断内存区块是否为空
     * @return
     */
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 判断内存区块是否已满
     * @return
     */
    public boolean isOutOfBoundary() {
        if (size >= MEM_BLOCK_SIZE) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 查找元素在内存区块数组中的位置
     * @param o
     * @return
     */
    public int indesxOfElement(Object o) {
        for (int i=0;i<MEM_BLOCK_SIZE;i++) {
            if (array[i] == o) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 向内存块存入新数据
     * @param o
     * @return 移除最近未使用的数据
     */
    public Object push(Object o) {
        int t=-1;
        if (!isOutOfBoundary() && indesxOfElement(o) == -1) {
            array[size] = o;
            size++;
        } else if (isOutOfBoundary() && indesxOfElement(o) == -1) {
            for (int i = 0; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size-1] = o;
        } else {
            t = indesxOfElement(o);
            for (int i=t;i<size-1;i++) {
                array[i] = array[i + 1];
            }
            array[size-1] = o;
        }
        if (t == -1) {
            return null;
        } else {
            return array[t];
        }
    }

    public void showMemoryBlock() {
        for (int i=0;i<size;i++) {
            System.out.print(array[i]+" ");
        }
    }
}
