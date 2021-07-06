package com.zxk.homework;

import java.util.ArrayList;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/27/ 20:52
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test5 {
    public static void main(String[] args) {

        ArrayList<Double> list = new ArrayList<>();
        list.add(88.5);
        list.add(39.2);
        list.add(77.1);
        list.add(56.8);
        list.add(89.0);
        list.add(99.0);
        list.add(59.5);
        System.out.println("使用增强for遍历如下");
        for (Double d : list) {
            System.out.println(d);
        }
        System.out.println("使用增强for遍历所有元素，打印不及格的分数");
        for (Double d : list) {
            if (d < 60.0) {
                System.out.println(d);
            }
        }
        System.out.println(" 使用增强for遍历所有元素，计算不及格的分数的数量，和平均分，并打印计算结果。");
        int count = 0;
        int sum = 0;
        for (Double d : list) {
            if (d < 60.0) {
                //System.out.println(d);
                count++;
                sum += d;
            }
        }
        System.out.println(sum / count);

        System.out.println("使用增强for遍历所有元素，求出最高分，并打印");
        double temp = list.get(0);
        for (Double d : list) {
            if (temp < d) {
                temp = d;
            }
        }
        System.out.println(temp);

    }
}
