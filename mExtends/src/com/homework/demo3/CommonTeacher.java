package com.homework.demo3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 20:52
 * @Description:普通教师
 * @GitHup: 957kk
 */
public class CommonTeacher extends Teacher{
    @Override
    public void pay() {
        System.out.println("普通教师："+this.getBaseMoney());
    }

    public CommonTeacher(double baseMoney) {
        super(baseMoney);
    }

    public CommonTeacher() {
    }
}
