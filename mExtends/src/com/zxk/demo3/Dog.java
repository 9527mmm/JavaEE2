package com.zxk.demo3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/08/ 15:35
 * @Description:
 */
public class Dog extends Animal {
    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    public void lookDoor() {
        System.out.println("狗看门");
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
