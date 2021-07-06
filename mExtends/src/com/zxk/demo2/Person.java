package com.zxk.demo2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/08/ 15:07
 * @Description:
 */
public class Person {
    private String name="sdad";
    private int age=52;
    private int num=30;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

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

    public Person(String name, int age, int num) {
        this.name = name;
        this.age = age;
        this.num = num;
    }

    public Person() {
    }

    public void show() {
        System.out.println("fdff");
    }
}

