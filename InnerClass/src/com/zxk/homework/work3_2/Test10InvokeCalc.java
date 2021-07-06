package com.zxk.homework.work3_2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/22/ 17:09
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Test10InvokeCalc {
    public static void main(String[] args) {
        invokeCalc(new Calclator() {
            @Override
            public int calc(int a, int b) {
                return a - b;
            }
        });

        invokeCalc((a, b) -> {
            return a - b;
        });

    }

    private static void invokeCalc(Calclator calclator) {
        int result = calclator.calc(120, 130);
        System.out.println("结果是" + result);

    }
}

interface Calclator {
    int calc(int a, int b);
}
