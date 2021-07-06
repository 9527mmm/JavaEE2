package com.homework.test3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 20:08
 * @Description:
 * @GitHup: 957kk
 */
public class PersonTest {
    public static void main(String[] args) {
        Student stu = new Student("张三","15","杭州");
        stu.write();
        stu.info();
        Teacher teacher = new Teacher("李四","35","杭州");
        teacher.write();
        teacher.info();
    }
}
