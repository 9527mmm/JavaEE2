package com.zxk.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/25/ 15:21
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String start = "2020年11月11日 00:00:00";
        String end = "2020年11月11日 00:00:00";
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        long startTime = sdf.parse(start).getTime();
        long endTime = sdf.parse(end).getTime();


        String a = "2020年11月10日 0:03:47";
        String b = "2020年11月10日 0:03:47";
        long aTime = sdf.parse(a).getTime();
        long bTime = sdf.parse(b).getTime();
        if (aTime <= endTime && aTime >= startTime) {
            System.out.println("a参加了");
        } else {
            System.out.println("a没参加");
        }
        if (bTime <= endTime && bTime >= startTime) {
            System.out.println("b参加了");
        } else {
            System.out.println("b没参加");
        }

    }
}
