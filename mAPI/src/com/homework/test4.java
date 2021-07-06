package com.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/25/ 19:29
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test4 {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个生日：yyyy年MM月dd日");
        String s1 = scanner.next();
        System.out.println("请输入第二个生日：yyyy年MM月dd日");
        String s2 = scanner.next();
        System.out.println("-----------第一-----------");
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        Date parse1 = sdf.parse(s1);
        Date parse2 = sdf.parse(s2);
        long time1 = parse1.getTime();
        long time2 = parse2.getTime();

        if (time1 > time2) {
            System.out.println("第一个年龄小");
        } else if (time1 < time2) {
            System.out.println("第二个年龄小");
        } else {
            System.out.println("俩人一样大");
        }
        System.out.println(date);

    }
}
