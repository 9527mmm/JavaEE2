package com.homework.demo3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 20:53
 * @Description:
 * @GitHup: 957kk
 */
public class TestTeacher {
    public static void main(String[] args) {
        CommonTeacher commonTeacher = new CommonTeacher(3000);
        commonTeacher.pay();
        HighTeacher highTeacher = new HighTeacher(4000);
        highTeacher.pay();
        SuperfineTeacher superfineTeacher = new SuperfineTeacher(5000);
        superfineTeacher.pay();
    }
}
