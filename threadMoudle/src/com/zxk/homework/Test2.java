package com.zxk.homework;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
        new MyThread().start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    LocalDateTime nowTime = LocalDateTime.now();
                    DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                    String parse = pattern.format(nowTime);
                    System.out.println(parse);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                LocalDateTime nowTime = LocalDateTime.now();
                DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String parse = pattern.format(nowTime);
                System.out.println(parse);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}


class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Date date = new Date();
            long time = date.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String s = sdf.format(time);
            System.out.println(s);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}