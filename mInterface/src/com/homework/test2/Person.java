package com.homework.test2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/21/ 18:57
 * @Description:
 * @GitHup: 957kk
 */
public abstract class Person {
    private String id;
    private String name;
    private String age;

    final void notice() {
        noticeStart();
        body();
        noticeEnd();
    }

    final void noticeStart() {
        System.out.println("通知：");
    }

    abstract void body();

    final void noticeEnd() {
        System.out.println("        必胜环球科技有限公司");
    }
}
