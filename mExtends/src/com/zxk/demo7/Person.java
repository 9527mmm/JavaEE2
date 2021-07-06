package com.zxk.demo7;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 14:16
 * @Description:
 * @GitHup: 957kk
 */
public class Person {
    String name = "person";

    public Person() {
        name = "aaa";
        show();
    }

    public void show() {
        System.out.println(this.name);
    }
    public Person(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
