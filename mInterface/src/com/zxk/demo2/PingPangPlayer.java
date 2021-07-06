package com.zxk.demo2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/10/ 9:59
 * @Description:
 **/
public class PingPangPlayer extends Player implements SpeakEnglish {
    @Override
    public void eat() {
        System.out.println("乒乓球运动员吃吃吃");
    }

    @Override
    void study() {
        System.out.println("乒乓球学习传球和发球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员说英语");
    }
}
