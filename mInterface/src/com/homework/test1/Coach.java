package com.homework.test1;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/21/ 18:51
 * @Description:
 * @GitHup: 957kk
 */
public class Coach extends Person{
    @Override
    public String toString() {
        return "Coach{}";
    }

    @Override
    public void eat() {
        System.out.println("吃工作餐");

    }
}
