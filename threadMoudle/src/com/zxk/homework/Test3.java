package com.zxk.homework;

public class Test3 {
    public static void main(String[] args) {
        MyRunnable mr1 = new MyRunnable();
        Thread t1 = new Thread(mr1);
        t1.setName("线程0");
        t1.start();
        Thread t2 = new Thread(mr1);
        t2.setName("线程1");
        t2.start();

        Thread t3 = new Thread(mr1);
        t3.setName("线程2");
        t3.start();

        Thread t4 = new Thread(mr1);
        t4.setName("线程3");
        t4.start();

        Thread t5 = new Thread(mr1);
        t5.setName("线程4");
        t5.start();

        Thread t6 = new Thread(mr1);
        t6.setName("线程5");
        t6.start();

        Thread t7 = new Thread(mr1);
        t7.setName("线程6");
        t7.start();

        Thread t8 = new Thread(mr1);
        t8.setName("线程7");
        t8.start();

        Thread t9 = new Thread(mr1);
        t9.setName("线程8");
        t9.start();

        Thread t10 = new Thread(mr1);
        t10.setName("线程9");
        t10.start();

    }
}

class MyRunnable implements Runnable {

    private Object obj = new Object();
    private int count;
    @Override
    public void run() {
        synchronized (obj) {
            count++;
            System.out.println(Thread.currentThread().getName() + "通过山洞,他是第" + count + "个");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}