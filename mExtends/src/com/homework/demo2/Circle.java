package com.homework.demo2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 20:23
 * @Description: 圆形
 * @GitHup: 957kk
 */
public class Circle extends Shapes{
    private double r;//半径
    @Override
    public void area() {
        System.out.println("圆形面积："+this.r*this.r*Math.PI);
    }

    @Override
    public void c() {
        System.out.println("圆形周长："+2*Math.PI*this.r);
    }

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {
    }
}
