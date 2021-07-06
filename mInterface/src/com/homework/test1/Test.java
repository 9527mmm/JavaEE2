package com.homework.test1;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/21/ 18:52
 * @Description:
 * @GitHup: 957kk
 */
public class Test {
    public static void main(String[] args) {
        Person p=new Coach();
        p.eat();
        p.toString();
        p=new Player();
        p.eat();
        p.toString();
    }
}
