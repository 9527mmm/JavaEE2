package com.zxk.test;

import java.util.Random;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/02/ 16:14
 * @Description:
 */
public class test2 {
    public static void main(String[] args) {
       /* int i = 8;
        byte j = 8;
        System.out.println(i == j);
        int x = 97;
        char y = 'a';
        System.out.println(x == y);
        int a = 10;
        long b = 10;
        System.out.println(a == b);
        short c = 128;
        long d = 128;
        System.out.println(c == d);*/

        /**定义返回值类型为 int 类型，名为 getScore(int[] arr)的静态方法，方法内完成：获取指定数
         组 arr 中大于平均值的元素的个数，并返回。
         定义 main 方法，方法内完成：
         1）.定义一个长度为 5 的 int 数组 arr
         2）.使用随机数生成 5 个范围为 1-99 的数字存入 arr 中（包含 1 和 99），之后打印数组
         3）.传递 arr 调用 getScore(int[] arr)方法，获取方法返回值并在控制台打印输出该返回值*/

        int[] arr=new int[5];
        Random ra=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=ra.nextInt(99)+1;
        }
       // int a=getScore(arr);
    }

   // public static int getScore(int[] arr){
//return ;
    }

