package com.zxk.dao;

import com.zxk.po.Student;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/01/ 19:27
 * @Description:
 */
public class StudentDaoV1 implements BaseStudentDao{
    // 创建学生对象数组
    private static Student[] stus = new Student[5];
    static{
        Student s1=new Student("1","1","1","1");
        stus[0]=s1;
    }
    // 添加学生方法
    @Override
    public boolean addStudent(Student stu) {
        System.out.println(stus.hashCode());//hash值

        // 2. 添加学生到数组
        //2.1 定义变量index为-1，假设数组已经全部存满，没有null的元素
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            //非空判断，防止出现空指针异常
            if (student == null) {
                index = i;
                break;
            }
        }
        // 3. 返回是否添加成功的boolean类型状态
        if (index == -1) {
            // 装满了
            return false;
        } else {
            // 没有装满, 正常添加, 返回true
            stus[index] = stu;
            return true;
        }
    }


    @Override
    public Student[] findAllStudent() {
        return stus;
    }

    @Override
    public void deleteStudentById(String did) {

        int index = getIndex(did);
        if (index != -1) {
            stus[index] = null;
        }

    }

    @Override
    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student stu = StudentDaoV1.stus[i];
            if (stu != null && stu.getId().equals(id)) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public void updateStudent(String uid, Student newStu) {
        int index = getIndex(uid);
        stus[index] = newStu;
    }
}
