package com.zxk.demo2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/08/ 15:07
 * @Description:
 */
public class Student extends Person {
    public Student(String name, int age, int num) {
        super(name, age, num);
        age=58;
    }

    public Student() {
    }

    public void study() {
        System.out.println("好好学习");
    }

    @Override
    public void show() {
        System.out.println("子类");
    }
}
