package com.zxk.controller;

import com.zxk.po.Student;
import com.zxk.service.StudentService;

import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/01/ 19:27
 * @Description:
 */
public class OtherStudentControllerV2 extends BaseStudentController{

    private Scanner sc = new Scanner(System.in);

    @Override
    public Student inputStudentInfo(String uid) {
        System.out.println("输入姓名");
        String name = sc.next();
        System.out.println("输入年龄");
        String age = sc.next();
        System.out.println("输入生日");
        String bir = sc.next();
        //封装对象
        Student stu = new Student(uid,name,age,bir);

        return stu;
    }


}
