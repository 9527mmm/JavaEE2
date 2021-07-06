package com.zxk.demo8;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 15:50
 * @Description:
 * @GitHup: 957kk
 */
public class Student extends Person{
    private double money;

    public Student() {

    }

    public Student(String id, String name, String job, double money) {
        super(id, name, job);
        this.money = money;
    }

    @Override
    public void talk() {
        super.talk();
        System.out.println("Student说话");
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
