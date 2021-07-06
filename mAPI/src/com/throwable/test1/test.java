package com.throwable.test1;

import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/27/ 14:50
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test {
    public static void main(String[] args) {

        Student stu = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("姓名");
        String s1 = sc.next();
        stu.setName(s1);

        while (true) {
            System.out.println("年龄");
            String s2 = sc.next();
            try {
                int i = Integer.parseInt(s2);
                stu.setAge(i);
                break;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("格式化错误");
                continue;
            } catch (AgeOutOfBoundsException e) {
                e.printStackTrace();
                e.getMessage();
                System.out.println("范围错误");
                continue;
            }
        }
        System.out.println("结束");
    }
}
