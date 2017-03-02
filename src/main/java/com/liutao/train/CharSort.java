package com.liutao.train;

/**
 * Created by liutao on 17-2-27.
 */
public class CharSort {

    /**
     * 一个字符串重新排序，字母在前，数字在后
     * @param str
     */
    public static String StrSort(String str){
        char[] chars = str.toCharArray();
        int length =chars.length;
        char num[] = new char[length];
        char zimu[] = new char[length];
        int n=0,m=0;
        for (int i=0;i<chars.length;i++) {
            if (Character.isDigit(chars[i])) {
                num[n]=chars[i];
                n++;
            }else{
                zimu[m] = chars[i];
                m++;
            }
        }
        for (;m < length; ++m) {
            zimu[m] = num[length - 1 - m];
        }
        return String.valueOf(zimu);
    }

    public static String StrSort2(String str) {
        char[] chars = str.toCharArray();
        int length =chars.length;
        StringBuffer num = new StringBuffer();
        StringBuffer noNum = new StringBuffer();
        for (int i=0;i<length;i++) {
            if (Character.isDigit(chars[i])) {
                num.append(chars[i]);
            } else {
                noNum.append(chars[i]);
            }
        }
        return noNum.append(num).toString();
    }
}
