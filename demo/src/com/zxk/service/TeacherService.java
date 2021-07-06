package com.zxk.service;

import com.zxk.dao.TeacherDao;
import com.zxk.po.Teacher;


/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/17/ 11:24
 * @Description:
 * @GitHup: 957kk
 */
public class TeacherService {
    private TeacherDao teacherDao = new TeacherDao();

    public boolean addTeacher(Teacher stu) {

        return teacherDao.addTeacher(stu);
    }

    public boolean isExists(String id) {

        Teacher[] stus = teacherDao.findAllTeacher();
        boolean exists = false;
        for (int i = 0; i < stus.length; i++) {
            Teacher teacher = stus[i];
            if (teacher != null && teacher.getId().equals(id)) {
                exists = true;
                break;
            }
        }
        return exists;
    }
    public Teacher[] findAllTeacher() {
        // 1. 调用库管对象的findAllTeacher获取学生对象数组
        Teacher[] allTeacher = teacherDao.findAllTeacher();
        // 2. 判断数组中是否有学生信息 (有: 返回地址,  没有: 返回null)
        // 思路: 数组中只要存在一个不是null的元素, 那就代表有学生信息
        boolean flag = false;
        for (int i = 0; i < allTeacher.length; i++) {
            Teacher stu = allTeacher[i];
            if (stu != null) {
                flag = true;
                break;
            }
        }
        if (flag) {
            // 有信息
            return allTeacher;
        } else {
            // 没有信息
            return null;
        }
    }
    public void deleteTeacherById(String did) {

        teacherDao.deleteTeacherById(did);
    }

    public void updateTeacher(String uid, Teacher newStu) {

        teacherDao.updateTeacher(uid, newStu);
    }

}
