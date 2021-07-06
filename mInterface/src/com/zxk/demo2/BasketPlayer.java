package com.zxk.demo2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/10/ 9:59
 * @Description:
 **/
public class BasketPlayer extends Player {

    @Override
    public void eat() {
        System.out.println("篮球运动员吃肉");
    }

    @Override
    void study() {
        System.out.println("学习传球运球");
    }
}
