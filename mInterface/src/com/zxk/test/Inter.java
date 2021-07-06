package com.zxk.test;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/09/ 16:26
 * @Description:
 */
public interface Inter {

    int NUM1 = 9;

    void show();


    //void eat();

    void jumpping();
    default void showw(){
        System.out.println("");
    }
}
