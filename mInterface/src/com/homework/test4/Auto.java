package com.homework.test4;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/21/ 19:28
 * @Description:
 * @GitHup: 957kk
 */
public class Auto extends Vehicle implements GPS {
    @Override
    void operation() {
        System.out.println("跑起来了");
    }

    public Auto() {
    }

    public Auto(String brand, String price) {
        super(brand, price);
    }

    @Override
    public void gPS() {

    }
}
