package com.zxk.demo3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/21/ 15:59
 * @Description:
 * @GitHup: 957kk
 */
public class FuZiFactory {
    @Override
    public String toString() {
        return "FuZiFactory{}";
    }

    public static FuZi ShengChan(){
        FuZi fuZi= new FuZi("dd","dd","dd","ff");
        return fuZi;

    }

}
