package com.zxk.demo8;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 15:50
 * @Description:
 * @GitHup: 957kk
 */
public class Teacher extends Person{
    private double salary;

    @Override
    public void talk() {
        super.talk();
        System.out.println("Teacher说话");
    }

    public Teacher() {
    }

    public Teacher(String id, String name, String job,double salary) {
        super(id, name, job);
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
