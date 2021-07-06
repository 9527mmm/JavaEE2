package com.homework.demo2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 20:23
 * @Description: 三角形
 * @GitHup: 957kk
 */
public class Triagle extends Shapes{
    private double a;
    private double b;
    private double c;


    @Override
    public void area() {
        System.out.println("三角形面积"+((this.a*this.b)/2));
    }

    @Override
    public void c() {
        System.out.println("三角形周长："+(this.a+this.b+this.c));
    }

    public Triagle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triagle() {
    }
}
