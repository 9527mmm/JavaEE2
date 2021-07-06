package com.zxk.demo3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/08/ 15:35
 * @Description:
 */
public class Animal {
    private String name;
    private int age;

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

    public Animal() {
    }

    public void eat() {

    }

}
