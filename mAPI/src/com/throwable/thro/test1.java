package com.throwable.thro;

import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/27/ 11:48
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test1 {
    public static void main(String[] args) {


        try {
            Scanner scc = new Scanner(System.in);
            System.out.println("年龄");
            int i = Integer.parseInt(scc.nextLine());
            System.out.println(i);
            throw new ArithmeticException("我没有了");
           // System.out.println(2/0);
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            System.out.println("格式化异常");
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("数学异常");
        }
        System.out.println("我还在");
    }
}
