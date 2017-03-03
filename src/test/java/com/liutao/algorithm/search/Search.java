package com.liutao.algorithm.search;

/**
 * Created by liutao42
 * on 2017/3/3.
 */
public class Search {

    /**
     * 顺序查找
     *
     * @param a
     * @param value
     * @return
     */
    public static int sequenceSearch(int a[], int value) {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            if (a[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 二分查找（折半查找）V_1
     *
     * @param a
     * @param value
     * @return
     */
    public static int binarySearch1(int a[], int value) {
        int length = a.length;
        int mid;
        int low = 0;
        int high = length - 1;
        while (low < high) {
            mid = (low + high) / 2;
            if (a[mid] == value) {
                return mid;
            }
            if (a[mid] > value) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    /**
     * 二分查找（折半查找）V_2（递归）
     *
     * @param a
     * @param value
     * @param low
     * @param high
     * @return
     */
    public static int binarySearch2(int a[], int value, int low, int high) {
        int mid = (low + high) / 2;
        if (a[mid] == value) {
            return mid;
        }
        if (a[mid] > value) {
            return binarySearch2(a, value, low, mid - 1);
        }
        if (a[mid] < value) {
            return binarySearch2(a, value, mid + 1, high);
        }
        return -1;
    }

    /**
     * 插值查找，一种自适应的查找
     * @param a
     * @param value
     * @param low
     * @param high
     * @return
     */
    public static int insertionSearch(int a[], int value, int low, int high) {
        int mid = low + (value - a[low]) / (a[high] - a[low]) * (high - low);
        if (a[mid] > value) {
            return binarySearch2(a, value, low, mid - 1);
        }
        if (a[mid] < value) {
            return binarySearch2(a, value, mid + 1, high);
        }
        return -1;
    }

}
