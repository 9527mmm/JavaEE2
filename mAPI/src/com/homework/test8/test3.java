package com.homework.test8;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/27/ 8:41
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("设置闹钟");
        String time = sc.next();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("HH:mm:ss");
        while (true) {
            LocalTime l = LocalTime.now();//当日
            LocalTime l1 = LocalTime.parse(time, pattern);//闹钟
            boolean before = l.isBefore(l1);
            if (before) {
                while (true) {
                    LocalTime end = LocalTime.now();
                    int i = l.toSecondOfDay();
                    int i1 = end.toSecondOfDay();
                    if (i1-i==1){
                        System.out.println(l);
                        break;
                    }
                }
            }else {
                System.out.println("闹钟时间到");
                return;
            }
        }

    }

}
