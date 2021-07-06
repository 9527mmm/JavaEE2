package com.homework.test7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/26/ 9:35
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test2 {
    private static ArrayList<User> users = new ArrayList<>();

    static {
        users.add(new User("zxk", "0370"));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入账号");
        String n = sc.next();
        System.out.println("输入密码");
        String pw = sc.next();
        for (int i = 0; i < users.size(); i++) {
            User u = users.get(i);
           /* if(u.getName().equals(sc.next())&&u.getPassword().equals(pw)){
                System.out.println("成功登录");
                break;
            }*/
            if (u.getName().equals(n)) {
                if (u.getPassword().equals(pw)) {
                    System.out.println("成功");
                    break;
                } else {
                    //System.out.println(LocalDate.now());
                    System.out.println(LocalDate.now()+"密码错误");
                }
            }
            if (u.getPassword().equals(pw)) {
                if (u.getName().equals(n)) {
                    System.out.println("成功");
                    break;
                } else {
                    System.out.println(LocalDate.now()+"用户名错误");
                }
            }
        }


    }
}
