package com.zxk.test.myCallable;

import java.util.concurrent.Callable;

//泛型表示call()方法返回值的类型
public class MyCallable implements Callable<String> {


    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"跟女孩表白"+i+"次数");
        }


        //返回值表示线程运行完毕之后的结果
        return "很感动，答应了";
    }
}
