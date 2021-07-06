package com.homework.test6;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/26/ 9:16
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<>();
        regist(sc, users);


    }

    private static void regist(Scanner sc, ArrayList<User> users) {
        User u1 = new User();
        System.out.println("输入用户名");
        u1.setName(sc.next());
        System.out.println("输入密码");
        u1.setPassword(sc.next());
        System.out.println("输入出生日期");
        u1.setBir(sc.next());
        LocalDate now = LocalDate.now();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDate parse = LocalDate.parse(u1.getBir(), pattern);
        Period between = Period.between(parse, now);
        u1.setAge(between.getYears());
        System.out.println(between.getYears());
        System.out.println("输入电话");
        u1.setPhone(sc.next());
        users.add(u1);
        System.out.println("注册成功");
    }
}
