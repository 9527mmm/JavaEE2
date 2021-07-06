package com.zxk.homework;

public class Test {
    public static void main(String[] args) {

        takeAward ta = new takeAward();
        Thread t1 = new Thread(ta);
        t1.start();
        Thread t2 = new Thread(ta);
        t2.start();
        Thread t3 = new Thread(ta);
        t3.start();
    }
}
