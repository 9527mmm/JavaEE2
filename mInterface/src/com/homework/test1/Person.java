package com.homework.test1;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/21/ 18:48
 * @Description:
 * @GitHup: 957kk
 */
public abstract class Person {
    private String id;
    private String name;
    private String sex;
    private String age;
    public abstract void eat();

    public Person(String id, String name, String sex, String age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Person() {
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
