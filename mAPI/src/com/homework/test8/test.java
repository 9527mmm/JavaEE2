package com.homework.test8;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/26/ 10:02
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test {
    public static void main(String[] args) throws ParseException, InterruptedException {
       // final Thread t1 = new Thread()
        Scanner sc = new Scanner(System.in);
        System.out.println("输入时间");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");


        String time = sc.next();
       // String s=simpleDateFormat.format()
        Date parse1 = simpleDateFormat.parse(time);
        System.out.println(simpleDateFormat.format(parse1));

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.parse(time, pattern);
        LocalTime nowTime = LocalTime.now();
        Duration between = Duration.between(nowTime, localTime);
        LocalTime startTime = nowTime;
        System.out.println(between.getSeconds());
        System.out.println(nowTime);


        for (int i = 0; ; i++) {

            if (Duration.between(startTime, LocalTime.now()).getSeconds() == 1) {
                LocalTime localTime1 = LocalTime.now();
                System.out.println(localTime1);
            } else if (Duration.between(startTime, LocalTime.now()).getSeconds() == between.getSeconds()) {
                break ;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }



            /* while (Duration.between(startTime, LocalTime.now()).getSeconds() == 1) {
             *//* for (long i = 1; i <= between.getSeconds(); i++) {

                LocalTime localTime1 = LocalTime.now();
                String s2 = localTime1.toString();
                String substring = s2.substring(0, 8);
                System.out.println(substring);
            }*//*

                LocalTime localTime1 = LocalTime.now();
                System.out.println(localTime1);
            }
            */

        System.out.println("闹钟时间到");
    }

}
