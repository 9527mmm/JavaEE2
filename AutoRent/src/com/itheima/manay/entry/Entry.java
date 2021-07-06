package com.itheima.manay.entry;

import com.itheima.manay.carContorller.CarContorller;
import com.itheima.manay.carContorller.CarRontContorller;
import com.itheima.manay.carContorller.OtherCarContorller;

import java.util.Scanner;

public class Entry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("------欢迎来到汽车租赁系统------");
            System.out.println("请输入你的选择：1.汽车信息管理 2.汽车租赁管理 3.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    OtherCarContorller carContorller = new OtherCarContorller();
                    carContorller.start();
                    break;
                case "2":
                    CarRontContorller carRontContorller = new CarRontContorller();
                    carRontContorller.start();
                    break;
                case "3":
                    System.out.println("感谢您的使用，再见！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;
            }
        }
    }
}
