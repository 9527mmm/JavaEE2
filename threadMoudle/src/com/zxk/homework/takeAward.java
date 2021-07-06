package com.zxk.homework;

import java.util.ArrayList;

public class takeAward implements Runnable {
    private int count = 9;
    static String[] s = {"电视机", "电冰箱", "电脑", "游戏机", "洗衣机", "空调", "手机", "平板电脑", "电动车", "电饭煲"};
    static ArrayList<String> list = new ArrayList<>();
    Object obj = new Object();

    static {
        for (int i = 0; i < s.length; i++) {
            list.add(s[i]);
        }
    }

    @Override
    public void run() {
        while (true) {

            if (count < 0) {
                System.exit(0);
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (obj) {
                System.out.println(Thread.currentThread().getName() + "抽到了：" + list.get(count));
                list.remove(count);
                count--;
            }
        }

    }
}

