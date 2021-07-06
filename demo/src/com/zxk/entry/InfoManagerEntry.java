package com.zxk.entry;

import com.zxk.controller.StudentControllerV1;
import com.zxk.controller.TeacherController;


import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/01/ 19:29
 * @Description:
 */
public class InfoManagerEntry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("欢迎来到信息管理系统");
            System.out.println("1：学生管理系统 2：老师管理系统 3：退出");

            String c = sc.next();
            switch (c) {

                case "1":
                    System.out.println("学生管理");
                    StudentControllerV1 studentController = new StudentControllerV1();
                    studentController.start();
                    break;
                case "2":
                    System.out.println("老师管理");
                    TeacherController teacherController = new TeacherController();
                    teacherController.start();
                    break;
                case "3":
                    System.out.println("感谢您的使用");
                    //退出正在运行的jvm虚拟机
                    /**运行垃圾收集器。<p>调用<code>gc<code>方法建议Java虚拟机努力回收未使用的对象，
                     * 以使它们当前占用的内存可用，以便快速重用。当控制从方法调用中返回时，
                     * Java虚拟机已经尽了最大努力从所有丢弃的对象中回收空间。
                     * <code>System.gc()<code>有效地等同于调用:<blockquote><pre> Runtime.getRuntime().gc() <pre><blockquote>*/

                    System.exit(0);
                    break;
                default:

            }
        }
    }
}
