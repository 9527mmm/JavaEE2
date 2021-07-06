package com.homework.test1;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 19:18
 * @Description:
 * @GitHup: 957kk
 */
public class Teacher extends Person{
    private String project;

    public Teacher(String project) {
        this.project = project;
    }

    public Teacher(String name, String age, String project) {
        super(name, age);
        this.project = project;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public void showMsg() {
        System.out.println(this.getName()+"老师，讲授"+this.getProject()+"课");
    }
}
