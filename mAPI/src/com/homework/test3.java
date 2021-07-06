package com.homework;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/25/ 19:04
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入人您的生日，格式：yyyy-MM-dd");
        String s = sc.next();
        LocalDate nowTime = LocalDate.now();
        LocalDate p = LocalDate.parse(s);

        Period between = Period.between(p, nowTime);
        // DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        // DateTimeFormatter.ofPattern(between);
        System.out.println(between);
        System.out.println("你已经活了：" + between.getYears() + "年零" + between.getMonths() + "月零" + between.getDays() + "天了！");

    }
}
