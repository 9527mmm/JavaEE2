package com.zxk.dao;

import com.zxk.po.Student;

import java.util.ArrayList;

public interface BaseStudentDao {

    public abstract boolean addStudent(Student stu);


    public abstract Student[] findAllStudent();

    public abstract void deleteStudentById(String did);


    public abstract int getIndex(String id);

    public abstract void updateStudent(String uid, Student newStu);
}
