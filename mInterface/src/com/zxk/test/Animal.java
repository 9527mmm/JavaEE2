package com.zxk.test;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/09/ 16:51
 * @Description:
 **/
public abstract class Animal {
    public Animal() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;
    public abstract void eat();
}
