package com.zxk.demo6;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 9:42
 * @Description:
 * @GitHup: 957kk
 */
public class Worker extends Person {
    private String name;
    private String id;
    private int salary;
    int num = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Worker() {
        num++;
    }

    public Worker(String name, String id, int money) {
        this.name = name;
        this.id = id;
        this.salary = money;
    }

    /*@Override
    public void eat() {
    }*/
}
