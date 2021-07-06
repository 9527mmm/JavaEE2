package com.zxk.homework.project2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/22/ 19:36
 * @Description: TODO
 * @GitHup: 957kk
 */
public  class Computer {
    void powerOn() {
        System.out.println("开机");
    }

    void powerDown() {
        System.out.println("关机");
    }

    public void useUSB(USB usb) {
        usb.connet();
        usb.disconnet();
    }
}
