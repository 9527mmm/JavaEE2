package com.zxk.service;

import com.zxk.dao.BaseStudentDao;
import com.zxk.dao.OtherStudentDaoV2;
import com.zxk.dao.StudentDaoV1;
import com.zxk.factory.StudentDaoFactory;
import com.zxk.po.Student;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/01/ 19:26
 * @Description:
 */
public class StudentService {
    //private OtherStudentDaoV2 studentDao = new OtherStudentDaoV2();
private BaseStudentDao studentDao=StudentDaoFactory.getStudentDao();
    public boolean addStudent(Student stu) {

        return studentDao.addStudent(stu);
    }

    public boolean isExists(String id) {

        Student[] stus = studentDao.findAllStudent();
        boolean exists = false;

        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student != null && student.getId().equals(id)) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public Student[] findAllStudent() {
        // 1. 调用库管对象的findAllStudent获取学生对象数组
        Student[] allStudent = studentDao.findAllStudent();
        // 2. 判断数组中是否有学生信息 (有: 返回地址,  没有: 返回null)
        // 思路: 数组中只要存在一个不是null的元素, 那就代表有学生信息
        boolean flag = false;
        for (int i = 0; i < allStudent.length; i++) {
            Student stu = allStudent[i];
            if (stu != null) {
                flag = true;
                break;
            }
        }
        if (flag) {
            // 有信息
            return allStudent;
        } else {
            // 没有信息
            return null;
        }
    }

    public void deleteStudentById(String did) {

        studentDao.deleteStudentById(did);
    }

    public void updateStudent(String uid, Student newStu) {

        studentDao.updateStudent(uid, newStu);
    }
}
