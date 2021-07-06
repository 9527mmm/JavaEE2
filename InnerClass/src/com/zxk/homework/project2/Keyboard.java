package com.zxk.homework.project2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/22/ 19:36
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Keyboard implements USB{
    @Override
    public void connet() {
        System.out.println("键盘已连接");

    }

    @Override
    public void disconnet() {
        System.out.println("键盘已断开连接");

    }

}
