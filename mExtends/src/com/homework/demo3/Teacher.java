package com.homework.demo3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 20:51
 * @Description:
 * @GitHup: 957kk
 */
public abstract class Teacher {
    private double baseMoney;

    public Teacher(double baseMoney) {
        this.baseMoney = baseMoney;
    }

    public abstract void pay();

    public double getBaseMoney() {
        return baseMoney;
    }

    public void setBaseMoney(double baseMoney) {
        this.baseMoney = baseMoney;
    }

    public Teacher() {
    }
}
