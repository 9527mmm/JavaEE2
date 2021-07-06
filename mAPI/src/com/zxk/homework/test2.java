package com.zxk.homework;

import java.util.ArrayList;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/24/ 18:48
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test2 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList();
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 10000000; i++) {
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
