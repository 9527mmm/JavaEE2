package com.homework.test1;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 19:25
 * @Description:
 * @GitHup: 957kk
 */
public class PersonTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("王小平","30","Java");
        teacher.showMsg();
        Student student = new Student("李小乐","15","0");
        student.showMsg();
    }
}
