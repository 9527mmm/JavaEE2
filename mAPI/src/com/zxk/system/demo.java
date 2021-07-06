package com.zxk.system;

import java.util.Random;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/24/ 16:43
 * @Description: TODO
 * @GitHup: 957kk
 */
public class demo {
    public static void main(String[] args) {

        int[] z = new int[10000000];
        for (int i = 0; i < 10000000; i++) {
            z[i] = i;
        }
        System.out.println("第一种");
        long start = System.currentTimeMillis();
        for (int i = 0; i < z.length; i++) {
            if (z[i] == 9999999) {
                System.out.println(z[i]);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println("第二种");

        int index = binarySerachForIndex(z, 9999999);

        System.out.println("索引是"+index);

        System.out.println("--------------冒泡---------------");
        int[] a = {2, 3, 5, 8, 9, 4, 7};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("-------------冒泡----------------");

        int[] b = {2, 3, 5, 8, 9, 4, 7};
        for (int i = b.length - 1; i >= 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (b[i] < b[j]) {
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        System.out.println("--------------冒泡排序---------------");

        int[] c = {2, 3, 5, 8, 9, 4, 7};
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - 1 - i; j++) {
                if (c[j] > c[j + 1]) {
                    int temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }


        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

    }

    /**
     * @Author: zhaoxuekai
     * @Description: //TODO 二分
     * @Date: 18:26 2021/6/24 0024
     * @Param: int[] z,int i
     * @return: int
     */
    private static int binarySerachForIndex(int[] z, int i) {
        long start = System.currentTimeMillis();
        int min = 0;
        int max = z.length - 1;
        while (min <= max) {
            int mid = (max + min) / 2;
            if (z[mid] > i) {
                max = mid - 1;
            } else if (z[mid] < i) {
                min = mid + 1;
            } else {
                return mid;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return -1;
    }
}
