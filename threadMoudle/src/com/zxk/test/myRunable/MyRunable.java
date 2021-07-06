package com.zxk.test.myRunable;

public class MyRunable implements Runnable{
    @Override
    public void run() {
        //线程启动后
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}
