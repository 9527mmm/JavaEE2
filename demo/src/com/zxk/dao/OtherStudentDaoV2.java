package com.zxk.dao;

import com.zxk.po.Student;

import java.util.ArrayList;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/01/ 19:27
 * @Description:
 */
public class OtherStudentDaoV2 implements BaseStudentDao {
    // 创建学生对象数组
    private static ArrayList<Student> stus = new ArrayList<>();

    static {
        Student s1 = new Student("1", "1", "1", "1");
        stus.add(s1);
    }


    /**
     * @Author: zhaoxuekai
     * @Description: //TODO  添加学生方法
     * @Date: 10:41 2021/6/21 0021
     * @Param: stu
     * @return: true
     */
    @Override
    public boolean addStudent(Student stu) {
        stus.add(stu);
        return true;
    }


    /**
     * @Author: zhaoxuekai
     * @Description: //TODO 查看学生方法
     * @Date: 10:43 2021/6/21 0021
     * @Param:
     * @return:
     */
    @Override
    public Student[] findAllStudent() {
        Student[] ss = new Student[stus.size()];
        for (int i = 0; i < ss.length; i++) {
            ss[i] = stus.get(i);
        }
        return ss;
    }

    @Override
    public void deleteStudentById(String did) {
        int index = getIndex(did);
        stus.remove(index);
    }

    @Override
    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < stus.size(); i++) {
            Student stu = stus.get(i);
            if (stu != null && stu.getId().equals(id)) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public void updateStudent(String uid, Student newStu) {
        int index = getIndex(uid);
        stus.set(index, newStu);
    }
}
