package com.zxk.demo5;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 9:39
 * @Description:
 * @GitHup: 957kk
 */
public class Person {
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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}
