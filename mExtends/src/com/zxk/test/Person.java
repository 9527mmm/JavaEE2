package com.zxk.test;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/08/ 10:43
 * @Description:
 */
public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public void call() {
        System.out.println("打电话给父类");
    }

    public void show() {

    }
}
