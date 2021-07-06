package com.zxk.demo4;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/09/ 11:37
 * @Description:
 */
public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void eat() {
        System.out.println("狗吃");
    }
}
