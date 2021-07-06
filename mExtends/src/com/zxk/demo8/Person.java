package com.zxk.demo8;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 15:50
 * @Description:
 * @GitHup: 957kk
 */
public abstract class Person {
    private String id;
    private String name;
    private String job;

    public Person() {
    }

    public Person(String id, String name, String job) {
        this.id = id;
        this.name = name;
        this.job = job;
    }
    public void login(){
        System.out.println("登陆成功");
    }
    public void register(){
        System.out.println("注册成功");
    }
    public void talk(){

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
