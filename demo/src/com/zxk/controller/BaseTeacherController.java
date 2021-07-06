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
public class BaseTeacherController {

    private TeacherService teacherService = new TeacherService();
    private Scanner sc = new Scanner(System.in);

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

    /**
     * @Author: zhaoxuekai
     * @Description: //TODO 查看
     * @Date: 16:35 2021/6/17 0017
     * @Param:
     * @return:
     */
    public final void findAllTeacher() {
        Teacher[] stus = teacherService.findAllTeacher();
        if (stus == null) {
            System.out.println("查无信息，稍后重试");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < stus.length; i++) {
            Teacher stu = stus[i];
            if (stu != null) {
                System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t\t" + stu.getBir());
            }
        }

    }

    /**
     * @Author: zhaoxuekai
     * @Description: //TODO 修改
     * @Date: 16:35 2021/6/17 0017
     * @Param:
     * @return:
     */
    public final void updateTeacher() {
        String uid=inputTeacher();
        Teacher stu = inputTeacherInfo(uid);
        teacherService.updateTeacher(uid, stu);
    }
    /**
     * @Author: zhaoxuekai
     * @Description: //TODO 删除
     * @Date: 16:36 2021/6/17 0017
     * @Param:
     * @return:
     */
    public final void deleteTeacherById() {
        String did=inputTeacher();
        teacherService.deleteTeacherById(did);
        System.out.println("删除成功");
    }

    /**
     * @Author: zhaoxuekai
     * @Description: //TODO 增加
     * @Date: 16:35 2021/6/17 0017
     * @Param:
     * @return:
     */
    public final void addTeacher() {
        System.out.println("请输入老师id");
        String id=sc.next();
        Teacher stu = inputTeacherInfo(id);
        boolean result = teacherService.addTeacher(stu);
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }
    public final Teacher inputTeacherInfo(String uid) {
        System.out.println("输入姓名");
        String name = sc.next();
        System.out.println("输入年龄");
        String age = sc.next();
        System.out.println("输入生日");
        String bir = sc.next();
        //封装对象
        Teacher stu = new Teacher();
        stu.setId(uid);
        stu.setName(name);
        stu.setAge(age);
        stu.setBir(bir);
        return stu;
    }
    public final String inputTeacher(){
        String did;
        while (true) {
            System.out.println("请输入老师id");
            did = sc.next();
            boolean exists = teacherService.isExists(did);
            if (!exists) {
                System.out.println("不存在，请重新输入");
            } else {
                break;
            }
        }
        return did;
    }
}
