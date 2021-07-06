package com.homework.demo2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 20:46
 * @Description:
 * @GitHup: 957kk
 */
public class TestShapes {
    public static void main(String[] args) {
        Triagle triagle = new Triagle(3,4,5);
        triagle.area();
        triagle.c();
        Circle circle = new Circle(4);
        circle.area();
        circle.c();
        Rectangle rectangle = new Rectangle(5,4);
        rectangle.area();
        rectangle.c();
    }
}
