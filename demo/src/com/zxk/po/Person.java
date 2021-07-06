package com.zxk.po;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/17/ 14:29
 * @Description:
 * @GitHup: 957kk
 */
public class Person {
    private String id;
    private String name;
    private String age;
    private String bir;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getBir() {
        return bir;
    }

    public void setBir(String bir) {
        this.bir = bir;
    }

    public Person(String id, String name, String age, String bir) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bir = bir;
    }

    public Person() {
    }
}
