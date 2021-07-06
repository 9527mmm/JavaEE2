package com.throwable.test1;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/27/ 14:50
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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

    public void setAge(int age) throws AgeOutOfBoundsException {
        if (age >= 15 && age <= 25) {
            this.age = age;
        } else {
            throw new AgeOutOfBoundsException("年龄不在范围内");
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
