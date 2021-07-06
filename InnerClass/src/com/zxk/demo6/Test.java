package com.zxk.demo6;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/22/ 15:56
 * @Description: lambda精简版
 * @GitHup: 957kk
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        /**
         * 匿名内部类
         */
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        /**
         * lambda表达式原版
         */
        list.forEach((s) -> {
            System.out.println(s);
        });
        /**
         * lambda表达式精简版
         */
        list.forEach(s -> System.out.println(s));

        getShow(new ran() {
            @Override
            public String show(String name) {
                return "可以哦" + name;
            }
        });

        getShow(name -> name + "这也可以");
    }

    /**
     * @Author: zhaoxuekai
     * @Description: //TODO getShow方法
     * @Date: 16:02 2021/6/22 0022
     * @Param: r
     * @return:
     */
    public static void getShow(ran r) {
        System.out.println(r.show("张三"));
    }
}

interface ran {
    String show(String name);
}