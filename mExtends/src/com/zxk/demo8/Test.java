package com.zxk.demo8;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 15:49
 * @Description:
 * @GitHup: 957kk
 */
public class Test {
    public static void main(String[] args) {
        Student stu1=new Student("111","张三","学生",18000);
        System.out.println("姓名"+stu1.getName()+"职位"+stu1.getJob()+"学费"+stu1.getMoney());
        Teacher teacher=new Teacher("222","李四","老师",12000);
        System.out.println("姓名"+teacher.getName()+"职位"+teacher.getJob()+"薪水"+teacher.getSalary());
    }
}
