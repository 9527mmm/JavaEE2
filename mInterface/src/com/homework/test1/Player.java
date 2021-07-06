package com.homework.test1;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/21/ 18:50
 * @Description:
 * @GitHup: 957kk
 */
public class Player extends Person{
    private String Class;
    @Override
    public String toString() {
        return "Player{}";
    }

    @Override
    public void eat() {
        System.out.println("吃营养餐");
    }
}
