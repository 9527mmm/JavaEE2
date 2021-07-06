package com.homework.test3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/21/ 19:17
 * @Description:
 * @GitHup: 957kk
 */
public class UiTeacher extends Employee implements Draw{
    @Override
    public void draw() {
        System.out.println("Ui画画");
    }

    @Override
    void work() {
        System.out.println("Ui老师讲Ui");
    }
}
