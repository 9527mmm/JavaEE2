package com.zxk.homework.test3;

import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/27/ 19:15
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test3 {
    public static void main(String[] args) {
        System.out.println(inputInt());
        System.out.println(inputDecimals());
        System.out.println(inputString());

    }

    private static String inputString() {
        String s1;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入一句话");
            try {
                s1 = sc.next();
                break;
            } catch (RuntimeException e) {
                e.printStackTrace();
                System.out.println("输入错误，请务必输入字符串");
            }
        }
        return s1;
    }


    private static double inputDecimals() {
        String d2;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入小数");
            d2 = sc.next();

            try {
                if(d2.indexOf(".")>0&&d2.contains(".")){
                    Double.parseDouble(d2);
                    break;
                }else {
                    throw new RuntimeException("输入小数");
                }

            } catch (RuntimeException e) {
                e.printStackTrace();
                System.out.println("输入错误，请务必输入小数");
            }
        }
        return Double.parseDouble(d2);
    }

    private static int inputInt() {
        int i3;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入整数");
            try {
                i3 = sc.nextInt();
                break;
            } catch (RuntimeException e) {
                e.printStackTrace();
                System.out.println("输入错误，请务必输入整数");
            }
        }
        return i3;
    }

}
