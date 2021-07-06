package com.zxk.test;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/09/ 15:56
 * @Description:
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();

        a = new Dog();
        a.eat();
        a.show();
    }
}
