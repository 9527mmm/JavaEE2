package com.zxk.test.myRunable;

public class newTest {
    public static void main(String[] args) {
        MRunable mr = new MRunable();
        Thread t1 = new Thread(mr);
        t1.start();

    }
}
class MRunable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"@@@"+i);
        }
    }
}
