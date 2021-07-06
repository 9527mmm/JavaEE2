package com.homework.demo3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 20:53
 * @Description:
 * @GitHup: 957kk
 */
public class HighTeacher extends Teacher{
    @Override
    public void pay() {
        System.out.println("高级教师："+this.getBaseMoney());
    }

    public HighTeacher(double baseMoney) {
        super(baseMoney);
    }

    public HighTeacher() {
    }
}
