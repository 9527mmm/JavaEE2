package com.zxk.homework;

import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/24/ 19:16
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄和身高：（年龄是整数，身高是小数，中间使用逗号分割）");
        String s = sc.next();
        String[] s2 = s.split(",");
        System.out.println("转换成整数后的年龄是：" + Integer.parseInt(s2[0]));
        System.out.println("转换成小数后的体重是：" + Double.parseDouble(s2[1]));
    }
}
