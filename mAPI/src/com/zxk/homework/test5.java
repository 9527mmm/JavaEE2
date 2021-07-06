package com.zxk.homework;

import sun.font.FontRunIterator;

import java.util.Arrays;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/24/ 19:26
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test5 {
    public static void main(String[] args) {
        int[] arr = {431, 54, 25, 25, 26, 45, 2, 4, 65, 3, 64, 6, 46, 7, 54};
        Arrays.sort(arr);
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ",");
            }
        }
        int index1 = binarySerachForIndex(arr, 2);
        System.out.println("元素2在数组中的索引是：" + index1);
        int index2 = binarySerachForIndex(arr, 200);
        System.out.println("元素200在数组中的索引是：" + index2);
    }
    private static int binarySerachForIndex(int[] arr, int i) {
        int min = 0;
        int max = arr.length - 1;
        while (min <=max) {
            int mid = (min + max) / 2;
            if (arr[mid] > i) {
                max = mid - 1;
            } else if (arr[mid] < i) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
        return -15;
    }
}
