package com.zxk.test;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/09/ 16:26
 * @Description:
 */
public class Cat extends Animal implements Inter {




    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
        super();
    }

    @Override
    public void show() {
        System.out.println("猫猫猫");
    }

    @Override
    public void eat() {
        System.out.println("吃吃吃");
    }

    @Override
    public void jumpping() {
        System.out.println("猫跳高");
    }
}
