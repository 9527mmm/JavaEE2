package com.zxk.homework2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileReader fr = new FileReader(".\\ioStream\\config.properties");
        BufferedReader br = new BufferedReader(fr);
        Properties prop = new Properties();
        prop.load(br);
        System.out.println(prop.toString());
        System.out.println("请输入用户名");
        String username = sc.next();
        System.out.println("请输入用户密码");
        String password = sc.next();
        if (username.equals(prop.get("username")) && password.equals(prop.get("password"))) {
            System.out.println("登陆成功");
            if (prop.get("color").equals("red")) {

                System.err.println(prop);
            }
            if (prop.get("color").equals("black")) {
                System.out.println(prop);
            }
        } else {
            System.out.println("登陆失败");
        }
        br.close();
    }
}
