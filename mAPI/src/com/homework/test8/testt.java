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
 * @Date: 2021/06/27/ 10:05
 * @Description: TODO
 * @GitHup: 957kk
 */
public class testt {
    public static void main(String[] args) throws ParseException, ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入时间");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");


        String time = sc.next();
        //String s=simpleDateFormat.format()
        Date parse1 = simpleDateFormat.parse(time);
        System.out.println(simpleDateFormat.format(parse1));

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.parse(time, pattern);
        LocalTime nowTime = LocalTime.now();
        Duration between = Duration.between(nowTime, localTime);
        System.out.println(between.getSeconds());
        for (long i = 1; i <= between.getSeconds(); i++) {
            LocalTime localTime1 = nowTime.plusSeconds(i);
            String s2 = localTime1.toString();
            String substring = s2.substring(0, 8);
            System.out.println(substring);
        }
        System.out.println("闹钟时间到");
    }

}
