package com.homework.test8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/26/ 10:02
 * @Description: TODO
 * @GitHup: 957kk
 */
public class newTest {
    public static void main(String[] args) throws ParseException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入时间");
        String time = sc.next();//闹钟时间
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.parse(time, pattern);//格式化时间
        LocalTime nowTime = LocalTime.now();//获取开始时间
        Duration between = Duration.between(nowTime, localTime); //获取开始与结束时间差值
        LocalTime startTime = nowTime;//记录开始时间
        System.out.println(between.getSeconds());
        System.out.println(nowTime);
        final Thread t1 = new Thread() {
            @Override
            public void run() {
                int i = 0;
                while (Duration.between(startTime, LocalTime.now()).getSeconds() < between.getSeconds()) {
                    if (Duration.between(startTime, LocalTime.now()).getSeconds() == between.getSeconds()) {
                        System.out.println("闹钟时间到");
                    }
                    LocalTime localTime1 = LocalTime.now();
                    String s2 = localTime1.toString();
                    String substring = s2.substring(0, 8);
                    System.out.println(substring);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();
    }
}