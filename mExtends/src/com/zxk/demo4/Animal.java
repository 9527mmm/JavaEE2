package com.zxk.demo4;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/09/ 11:37
 * @Description:
 */
public class Animal {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public void eat() {
    }
}
