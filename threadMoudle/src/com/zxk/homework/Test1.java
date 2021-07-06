package com.zxk.homework;

public class Test1 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    System.out.println(Thread.currentThread().getName() + "@@@" + "播放背景音乐");
                }
            }
        }).start();
        new Thread(() -> {
            while (true) {
                System.out.println(Thread.currentThread().getName() + "@@@" + "显示画面");
            }
        }).start();
    }
}
