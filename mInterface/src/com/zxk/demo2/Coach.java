package com.zxk.demo2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/10/ 9:59
 * @Description:
 **/
public abstract class Coach extends Person{

    abstract void teach();

    public Coach(String name, int age) {
        super(name, age);
    }

    public Coach() {
    }
}
