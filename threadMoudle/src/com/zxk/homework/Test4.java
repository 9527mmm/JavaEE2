package com.zxk.homework;


import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Test4 {
    public static void main(String[] args) {

        price mr1 = new price();
        Thread t1 = new Thread(mr1);
        t1.setName("张三");
        t1.start();

        Thread t2 = new Thread(mr1);
        t2.setName("李四");
        t2.start();

        Thread t3 = new Thread(mr1);
        t3.setName("王五");
        t3.start();
    }
}

class price implements Runnable {
    private Object object = new Object();
    static String[] s = {"电视机", "电冰箱", "电脑", "游戏机", "洗衣机", "空调", "手机", "平板电脑", "电动车", "电饭煲"};
    static ArrayList<String> list = new ArrayList<String>();

    static {
        for (int i = 0; i < s.length; i++) {
            list.add(s[i]);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i <=list.size(); i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (object) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Random ra = new Random();
                int a = ra.nextInt(list.size());
                String remove = list.remove(a);
                System.out.println(Thread.currentThread().getName() + "抽到了" + remove);

            }
        }
    }
}