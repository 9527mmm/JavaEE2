package com.zxk.test.myRunable;

public class Test2 {
    public static void main(String[] args) {

        MyRunable mr = new MyRunable();
        Thread t1 = new Thread(mr);
        t1.start();

        MyRunable mr2 = new MyRunable();
        Thread t2 = new Thread(mr2);
        t2.start();
    }

}
