package com.zxk.homework.work3_1;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/22/ 17:01
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Test {
    public static void main(String[] args) {
        invokeDirect(new Director() {
            @Override
            public void makeMovie() {
                System.out.println("导演拍电影啦");
            }
        });
        invokeDirect(() -> System.out.println("导演拍电影啦"));
    }

    private static void invokeDirect(Director director) {
        director.makeMovie();
    }
}

interface Director {
    void makeMovie();
}
