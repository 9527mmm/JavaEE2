package com.zxk.test.myCallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Test3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        MyCallable mc = new MyCallable();
        FutureTask<String> sft = new FutureTask<>(mc);
        Thread t1 = new Thread(sft);
        t1.start();
        String s1 = sft.get();
        System.out.println(s1);
        MyCallable mc2 = new MyCallable();
        FutureTask<String> sft2 = new FutureTask<>(mc2);
        Thread t2 = new Thread(sft2);
        t2.start();
        String s2 = sft.get();
        System.out.println(s2);
    }
}
