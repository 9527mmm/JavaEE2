package com.zxk.controller;

import com.zxk.po.Teacher;
import com.zxk.service.TeacherService;

import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/17/ 11:23
 * @Description:
 * @GitHup: 957kk
 */
public class TeacherController extends BaseTeacherController {

    private TeacherService teacherService = new TeacherService();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void start() {

        lo:
        while (true) {
            System.out.println("----欢迎来到老师管理系统----");
            System.out.println("请输入您的选择: 1.添加老师  2.删除老师  3.修改老师  4.查看老师  5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addTeacher();
                    break;
                case "2":
                    deleteTeacherById();
                    break;
                case "3":
                    updateTeacher();
                    break;
                case "4":
                    findAllTeacher();
                    break;
                case "5":
                    System.out.println("感谢您使用老师管理系统, 再见!");
                    break lo;
                default:
                    System.out.println("您的输入有误, 请重新输入");
                    break;
            }
        }
    }
}
