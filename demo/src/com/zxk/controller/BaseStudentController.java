package com.zxk.controller;

import com.zxk.po.Student;
import com.zxk.service.StudentService;

import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/01/ 19:27
 * @Description:
 */
public abstract class BaseStudentController {
    private StudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);
    //private  Student[] stus = studentService.findAllStudent();


    public void start() {
        lo:
        while (true) {
            System.out.println("----欢迎来到学生管理系统----");
            System.out.println("请输入您的选择: 1.添加学生  2.删除学生  3.修改学生  4.查看学生  5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addStudent();
                    break;
                case "2":
                    deleteStudentById();
                    break;
                case "3":
                    updateStudent();
                    break;
                case "4":
                    findAllStudent();
                    break;
                case "5":
                    System.out.println("感谢您使用学生管理系统, 再见!");
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
    public final void findAllStudent() {

        Student[] stus = studentService.findAllStudent();

        if (stus == null) {
            System.out.println("查无信息，稍后重试");
            return;
        }
        System.out.println("学号\t\t姓名\t年龄\t生日");
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
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
    public final void updateStudent() {

        Student[] stus = studentService.findAllStudent();
        System.out.println(stus.hashCode());

        if (stus == null) {
            System.out.println("查无信息，稍后重试");
            return;
        }

        String uid = inputStudent();
        Student stu = inputStudentInfo(uid);
        studentService.updateStudent(uid, stu);
    }

    /**
     * @Author: zhaoxuekai
     * @Description: //TODO 删除
     * @Date: 16:36 2021/6/17 0017
     * @Param:
     * @return:
     */
    public final void deleteStudentById() {
        Student[] stus = studentService.findAllStudent();
        //System.out.println(stus.hashCode());
        if (stus == null) {
            System.out.println("查无信息，稍后重试");
            return;
        }
        String did = inputStudent();
        studentService.deleteStudentById(did);
        System.out.println("删除成功");
    }

    /**
     * @Author: zhaoxuekai
     * @Description: //TODO 增加
     * @Date: 16:35 2021/6/17 0017
     * @Param:
     * @return:
     */
    public final void addStudent() {
        String id;
        while (true) {
            System.out.println("请输入学生id");
            id = sc.next();
            boolean flag = studentService.isExists(id);
            if (flag) {
                System.out.println("学号已被占用，请重新输入");
            } else {
                break;
            }
        }
        Student stu = inputStudentInfo(id);
        boolean result = studentService.addStudent(stu);
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }

    public abstract Student inputStudentInfo(String uid);

    public final String inputStudent() {

        String did;
        while (true) {
            System.out.println("请输入学生id");
            did = sc.next();
            boolean exists = studentService.isExists(did);
            if (!exists) {
                System.out.println("不存在，请重新输入");
            } else {
                break;
            }
        }
        return did;
    }
}
