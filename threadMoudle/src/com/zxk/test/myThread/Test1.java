package com.zxk.test.myThread;

public class Test1 {
    public static void main(String[] args) {
        //创建一个线程对象
        MyThread t1 = new MyThread();
        //创建一个线程对象
        MyThread t2 = new MyThread();
        //开启第一个线程
        t1.start();
        //开启第二个线程
        t2.start();
        //创建对象去调方法，并没有开启线程
        //t1.run();
        //t2.run();
    }
}
