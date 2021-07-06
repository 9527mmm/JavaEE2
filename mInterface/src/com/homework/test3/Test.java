package com.homework.test3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/21/ 19:22
 * @Description:
 * @GitHup: 957kk
 */
public class Test {
    public static void main(String[] args) {
        Employee em=new JavaTeacher();
        em.work();
//        Draw d=new UiTeacher();
//        d.draw();
//        em=new UiTeacher();
        new UiTeacher().draw();
        new UiTeacher().work();
    }
}
