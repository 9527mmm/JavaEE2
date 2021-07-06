package com.homework.demo2;



/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 20:21
 * @Description:
 * @GitHup: 957kk
 */
public class Rectangle  extends Shapes {
    private double width;
    private double length;
    @Override
    public void area() {
        System.out.println("矩形面积是："+(width*length));
    }

    @Override
    public void c() {
        System.out.println("矩形周长是："+(2*(width+length)));

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
}
