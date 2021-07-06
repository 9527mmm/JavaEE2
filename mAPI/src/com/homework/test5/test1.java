package com.homework.test5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/25/ 19:41
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test1 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Things yadan = new Things("鸭蛋", 10, "2021-06-25 14:00:00", "2021-06-25 14:30:00");
        Things fan = new Things("摇头风扇", 2, "2021-06-25 16:00:00", "2021-06-25 16:30:00");
        Things xianglian = new Things("瓢虫项链", 5, "2021-06-25 20:00:00", "2021-06-25 22:30:00");
        ArrayList<Things> arr = new ArrayList<>();
        arr.add(yadan);
        arr.add(fan);
        arr.add(xianglian);
        System.out.println("JD秒杀。。。。");
        for (int i = 0; i < arr.size(); i++) {
            Things things = arr.get(i);
            System.out.println("商品编号" + (i + 1) + ":" + things.toString());
        }
        System.out.println("请输入想抢的商品");
        String want = sc.next();
        for (int i = 0; i < arr.size(); i++) {
            Things things = arr.get(i);
            if(want.equals(things.getName())){
                if(things.getAmount()>0){
                    Date date = new Date();
                    long time = date.getTime();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    Date startTime= sdf.parse(things.getStartTime());
                    Date EndTime = sdf.parse(things.getEndTime());
                    if(time>startTime.getTime()&&time<EndTime.getTime()){
                        System.out.println("成功");
                    }else {
                        System.out.println("不成功");
                    }
                }
            }
        }
    }
}
