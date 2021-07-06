package com.zxk.test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("用户名");
        String username=sc.next();
        System.out.println("密码");
        String password=sc.next();
        FileWriter fw = new FileWriter(".\\ioStream\\a.txt");
        fw.write(username);
        fw.write("\r\n");
        fw.write(password);
        fw.flush();
        fw.close();
    }
}
