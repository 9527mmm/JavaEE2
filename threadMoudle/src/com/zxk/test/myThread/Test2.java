package com.zxk.test.myThread;

public class Test2 {
    public static void main(String[] args) {
        MThread t1 = new MThread();
        t1.start();
        MThread t2 = new MThread();
        t2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main方法" + i);
        }
    }
}

class MThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "你好" + i);
        }
    }
}
