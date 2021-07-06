package com.homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/25/ 18:40
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test2 {
    public static void main(String[] args) throws ParseException {
        System.out.println("--------1--------");

        Date date = new Date();
        System.out.println(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String format = sdf.format(date.getTime());
        System.out.println(format);
        //System.out.println(sdf.parse(format));

        System.out.println("--------2--------");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        String format1 = now.format(pattern);
        System.out.println(format1);
    }
}
