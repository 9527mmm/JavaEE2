package com.homework.test3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/21/ 19:16
 * @Description:
 * @GitHup: 957kk
 */
public abstract class Employee {
    private String name;
    private String sex;
    private String age;

    abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                '}';
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

    public Employee() {
    }

    public Employee(String name, String sex, String age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
