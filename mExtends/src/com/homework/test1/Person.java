package com.homework.test1;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 19:18
 * @Description:
 * @GitHup: 957kk
 */
public abstract class Person {
    private String name;
    private String age;
    public abstract void showMsg();

    public Person() {
    }

    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
