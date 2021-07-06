package com.zxk.dao;

import com.zxk.po.Teacher;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/17/ 11:24
 * @Description:
 * @GitHup: 957kk
 */
public class TeacherDao {

    private static Teacher[] stus = new Teacher[5];

    // 添加学生方法
    public boolean addTeacher(Teacher stu) {
        System.out.println(stus.hashCode());//hash值

        // 2. 添加学生到数组
        //2.1 定义变量index为-1，假设数组已经全部存满，没有null的元素
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Teacher teacher = stus[i];
            //非空判断，防止出现空指针异常
            if (teacher == null) {
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


    public Teacher[] findAllTeacher() {
        return stus;
    }

    public void deleteTeacherById(String did) {

        int index = getIndex(did);
        if (index != -1) {
            stus[index] = null;
        }

    }

    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Teacher stu = TeacherDao.stus[i];
            if (stu != null && stu.getId().equals(id)) {
                index = i;
            }
        }
        return index;
    }

    public void updateTeacher(String uid, Teacher newStu) {
        int index = getIndex(uid);
        stus[index] = newStu;
    }
}
