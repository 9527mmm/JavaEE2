package com.homework.test2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/21/ 19:08
 * @Description:
 * @GitHup: 957kk
 */
public class Test {
    public static void main(String[] args) {
       Person person=new Employee();
       person.notice();
       person=new Manager();
       person.notice();
    }
}
