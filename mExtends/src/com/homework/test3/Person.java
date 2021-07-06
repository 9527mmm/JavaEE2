package com.homework.test3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 20:03
 * @Description:
 * @GitHup: 957kk
 */
public abstract class Person {
    private String name;
    private String age;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Person() {
    }

    public Person(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public abstract void write();
    public final void info(){
        System.out.println("姓名："+this.getName()+"，年龄："+this.getAge()+"，住址："+this.getAddress());
        write();
    }
}
