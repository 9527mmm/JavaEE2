package com.zxk.test;

import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/02/ 11:11
 * @Description:
 */
public class test1 {
    public static void main(String[] args) {

        /**1. 创建一个长度为5的数组，利用随机数生成1-100（包含100）之间的随机数存入数组中，
         * 计算数组中的最大值、最小值和平均值并输出，将内容和索引都是偶数的元素和索引输出到控制台上


         */

       /* System.out.println("test1----------------------------------");
        int[] arr = new int[5];
        Random ra = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ra.nextInt(100) + 1;
            System.out.println(arr[i]);
        }
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        System.out.println("最小值是" + arr[0]);
        System.out.println("最大值是" + arr[arr.length - 1]);
        System.out.println("平均值是" + count / arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (i % 2 == 0) {
                    System.out.println("数是" + arr[i] + "索引是" + i);
                }
            }
        }

        *//** 2. 使用控制台输入一串字符，要求长度在10~15之间（需要使用代码进行校验，如果输入的字符串不符合要求需要重新输入），
         字符串中需要包含大写小写字母和数字（不需要代码校验），分别统计字符串中大写字母小写字母和数字的个数并输出到控制台（格式：大写字母有3个）*//*
        System.out.println("test2----------------------------------");

        Scanner sc = new Scanner(System.in);
        String s;
        while (true) {
            System.out.println("请输入字符串");
            s = sc.next();
            if (s.length() >= 10 & s.length() <= 15) {
                break;
            }
        }
        int big = 0;
        int small = 0;
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' & c <= 'z') {
                small++;
            } else if (c >= 'A' & c <= 'Z') {
                big++;
            } else if (c >= '0' & c <= '9') {
                num++;
            }
        }
        System.out.println("大写字母" + big);
        System.out.println("小写字母" + small);
        System.out.println("数字" + num);
*/
        /**  3. 分析以下需求并用代码实现

         1. 从键盘循环录入字符串，输入“end”表示结束（end不计入字符串）
         2. 将字符串中大写字母变成小写字母，小写字母变成大写字母，其他字符用“*”代替，将结果输出到控制台
         */
        System.out.println("test3----------------------------------");
        String abc="jint";
        String aaca=abc;
        System.out.println(abc==aaca);

        Scanner scc = new Scanner(System.in);
        String sss;
        String aaa = new String();
        while (true) {
            System.out.println("请输入一串字符");
            sss = scc.next();
            if (sss.indexOf("end") >= 0) {
                aaa = sss.substring(0, sss.indexOf("end"));
                break;
            }
            System.out.println(aaa);
        }

        for (int i = 0; i < aaa.length(); i++) {
            char c = aaa.charAt(i);
            if (c >= 'a' & c <= 'z') {
                c -= 32;
            } else if (c >= 'A' & c <= 'Z') {
                c += 32;
            } else {
                c = '*';
            }
            System.out.print(c);
        }


    }

}
