package com.zxk.demo2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/10/ 10:03
 * @Description:
 **/
public class PingPangCoach extends Coach implements SpeakEnglish {
    @Override
    public void eat() {
        System.out.println("乒乓球教练吃牛肉喝牛奶");
    }

    @Override
    void teach() {
        System.out.println("乒乓球教练教传球和发球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练说英语");
    }
}
