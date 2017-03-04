package com.liutao.algorithm;

/**
 * Created by liutao on 17-3-4.
 */
public class HeapSort {

    /**
     * 小顶堆，插入元素后重排序；
     * 堆插入元素，总是先插入最后，然后开始调整顺序
     * @param a
     * @param i
     */
    public static void minHeapFixup(int a[], int i) {
        int temp = a[i];
        int j=(i-1)/2;
        while (j >= 0 && i != 0) {
            if (a[j] < temp) {
                break;
            }
            a[i] = a[j];
            i=j;
            j = (i - 1)/2;
        }
        a[i] = temp;
    }

    /**
     * 小顶堆，删除元素后重排序
     * 堆删除元素，总是删除堆的第0个元素，然后把最后一个先放到第0个，再开始重排序
     * @param a
     */
    public static void MinHeapFixdown(int a[],int i,int n) {
        int temp = a[i];
        int j = 2 * i * 1;
        while (j < n) {
            if (j + 1 < n && a[j + 1] < a[j]) {
                j++;
            }
            if (a[j] >= temp) {
                break;
            }
            a[i] = a[j];
            i = j;
            j = 2 * i + 1;
        }
        a[i] = temp;
    }
}
