package com.zxk.demo2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/10/ 10:00
 * @Description:
 **/
public class BasketCoach extends Coach {
    @Override
    public void eat() {
        System.out.println("篮球教练吃肉");
    }

    @Override
    void teach() {
        System.out.println("篮球教练教发球和运球");
    }
}
