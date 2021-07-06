package com.homework.test6;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/26/ 9:14
 * @Description: TODO
 * @GitHup: 957kk
 */
public class User {
    private String name;
    private String password;
    private  String bir;
    private int age;
    private String phone;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", bir='" + bir + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBir() {
        return bir;
    }

    public void setBir(String bir) {
        this.bir = bir;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public User() {
    }

    public User(String name, String password, String bir, int age, String phone) {
        this.name = name;
        this.password = password;
        this.bir = bir;
        this.age = age;
        this.phone = phone;
    }
}
