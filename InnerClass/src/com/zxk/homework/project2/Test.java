package com.zxk.homework.project2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/22/ 19:41
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Test {
    public static void main(String[] args) {

       Mouse mouse=new Mouse();
       Keyboard keyboard=new Keyboard();
       Computer computer=new Computer();
       computer.powerOn();
       computer.powerDown();
       computer.useUSB(keyboard);
       computer.useUSB(mouse);

    }

}
