package com.homework.test8;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/26/ 12:08
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test2 {
    public static void main(String[] args) {
        final Thread t1 = new Thread(){
            @Override
            public void run(){
                int i = 0;
                while(i<10){
                    System.out.println("t1:"+i++);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
      /*  final Thread t2 = new Thread(){
            @Override
            public void run(){
                int i = 0;
                try {
                    t1.join();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                while(i<10){
                    System.out.println("t2:"+i++);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t3 = new Thread(){
            @Override
            public void run(){
                int i = 0;
                try {
                    t1.join();
                    t2.join();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                while(i<10){
                    System.out.println("t3:"+i++);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t4 = new Thread(){
            @Override
            public void run(){
                int i = 0;
                try {
                    t1.join();
                    t2.join();
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
                while(i<10){
                    System.out.println("t4:"+i++);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };*/
        t1.start();
        //t2.start();
        //t3.start();
        //t4.start();
    }
}