package com.liutao.algorithm.lintCode;

/**
 * Created by liutao
 * on 2017/2/21.
 */
public class Sort {

    /**
     * 选择排序
     */
    public static void selectionSort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * 直接插入排序
     *
     * @param array
     */
    public static void insertSort(int array[]) {
        int i, j;
        for (i = 1; i < array.length; i++) {
            //注意[0,i-1]都是有序的。如果待插入元素比arr[i-1]还大则无需再与[i-1]前面的元素进行比较了，反之则进入if语句
            if (array[i] < array[i - 1]) {
                int temp = array[i];
                for (j = i - 1; j >= 0 && array[j] > temp; j--) {
                    array[j + 1] = array[j];//把比temp大或相等的元素全部往后移动一个位置
                }
                array[j + 1] = temp;//把待排序的元素temp插入腾出位置的(j+1)
            }
        }
    }

    /**
     * 希尔排序
     *
     * @param a
     */
    public static void shellSort(int a[]) {
        int i, j, gap;
        for (gap = a.length / 2; gap > 0; gap /= 2) { //步长
            for (i = 0; i < gap; i++) {     //直接插入排序
                for (j = i + gap; j < a.length; j += gap) {
                    if (a[j] < a[j - gap]) {
                        int temp = a[j];
                        int k = j - gap;
                        while (k >= 0 && a[k] > temp) {
                            a[k + gap] = a[k];
                            k -= gap;
                        }
                        a[k + gap] = temp;
                    }
                }
            }
        }
    }

}
