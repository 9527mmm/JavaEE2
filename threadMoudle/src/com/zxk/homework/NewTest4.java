package com.zxk.homework;


import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class NewTest4 {
    public static void main(String[] args) {

        newPrice mr1 = new newPrice();
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

class newPrice implements Runnable{
    private Object object = new Object();
    static String[] s = {"电视机", "电冰箱", "电脑", "游戏机", "洗衣机", "空调", "手机", "平板电脑", "电动车", "电饭煲"};
    static ArrayList<String> list = new ArrayList<String>();
    private ReentrantLock lock = new ReentrantLock();
    private int count =10;
    static {
        for (int i = 0; i < s.length; i++) {
            list.add(s[i]);
        }
    }

    @Override
    public void run() {
        while (true) {
            //synchronized (obj){//多个线程必须使用同一把锁.
            try {
                lock.lock();
                if (count <= 0) {
                    //卖完了
                    break;
                } else {
                    Thread.sleep(500);
                    count--;
                    System.out.println(Thread.currentThread().getName() + "在卖票,还剩下" + count + "张票");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
            // }
        }

    }
}