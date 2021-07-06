package com.homework.demo3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 20:53
 * @Description:
 * @GitHup: 957kk
 */
public class SuperfineTeacher extends Teacher{

    @Override
    public void pay() {
        System.out.println("特级教师："+this.getBaseMoney());
    }

    public SuperfineTeacher(double baseMoney) {
        super(baseMoney);
    }

    public SuperfineTeacher() {
    }
}
