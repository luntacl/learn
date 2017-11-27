package com.liutao.algorithm.lintCode;

public class HeapSort {

    public int[] heapSort(int[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--) {
            adjustSort(a,i,a.length);
        }
        return a;
    }

    public void adjustSort(int[] a, int i, int length) {
        int temp = a[i];
        for (int k = 2 * i + 1; k < length; k = 2 * k + 1) {
            if (k + 1 < length && a[k] < a[k + 1]) {
                k++;
            }
            if (a[k] > temp) {
                a[i] = a[k];
                i = k;
            } else {
                break;
            }
        }
        a[i] = temp;
    }

    public static void main(String[] args) {
        int[] a = {2, 5, 6, 7, 18, 19, 8, 9, 0, 12, 23};
        HeapSort hs = new HeapSort();
        int[] arr = hs.heapSort(a);
        for (int x : arr) {
            System.out.println(x);
        }

    }
}
