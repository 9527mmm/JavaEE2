package com.homework.test1;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 19:18
 * @Description:
 * @GitHup: 957kk
 */
public class Student extends Person {
    private String grade;

    public Student(String grade) {
        this.grade = grade;
    }

    public Student(String name, String age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public void showMsg() {
        System.out.println(this.getName()+"同学，考试得了："+this.getGrade()+"分");
    }
}
