package com.zxk.demo7;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 14:16
 * @Description:
 * @GitHup: 957kk
 */
public class Student extends Person {

    private String age;

    public Student() {
    }

    public Student(String age) {
        this.age = age;
    }

    public Student(String name, String age) {
        super(name);
        this.age = age;
    }


    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
