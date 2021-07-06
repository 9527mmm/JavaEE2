package com.homework;

import java.text.Format;
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
public class newTest4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个生日：yyyy年MM月dd日");
        String s1 = scanner.next();
        System.out.println("请输入第二个生日：yyyy年MM月dd日");
        String s2 = scanner.next();

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日");

        LocalDate one = LocalDate.parse(s1, pattern);
        //pattern.format(one);
        System.out.println(one);
        LocalDate two = LocalDate.parse(s2, pattern);
        //pattern.format(one);
        //LocalDate now=LocalDate.now();
        Period between = Period.between(one, two);
        if (between.isNegative()) {
            System.out.println("第一个大");
        } else if (between.isZero()) {
            System.out.println("相等");
        } else {
            System.out.println("第二大");
        }

    }
}
