package com.zxk.homework.test3;

import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/27/ 19:17
 * @Description: TODO
 * @GitHup: 957kk
 */
public class input {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int i1;
        int i2;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第一个整数");
            try {
                i1 = sc.nextInt();
                break;
            } catch (RuntimeException e) {
                e.printStackTrace();
                System.out.println("输入错误，请务必输入整数");
            }
        }

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第二个整数");
            try {
                i2 = sc.nextInt();
                break;
            } catch (RuntimeException e) {
                e.printStackTrace();
                System.out.println("输入错误，请务必输入整数");
            }
        }
        System.out.println(i1/i2);
    }
}
