package com.zxk.homework.test6;

import java.util.ArrayList;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/27/ 21:05
 * @Description: TODO
 * @GitHup: 957kk
 */
/* 张三,22   李四,26    张翠山,38    赵六,19    张三丰,103    张无忌,17    赵敏,16  */
public class test6 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 22));
        list.add(new Student("李四", 26));
        list.add(new Student("张翠山", 38));
        list.add(new Student("赵张六", 19));
        list.add(new Student("张三丰", 103));
        list.add(new Student("张无忌", 17));
        list.add(new Student("赵敏", 16));
        ArrayList<Student> newList = getStudent(list);
        System.out.println(newList);
        /*for (Student student : newList) {
            System.out.println(student);
        }*/
    }

    private static ArrayList<Student> getStudent(ArrayList<Student> list) {
        ArrayList<Student> newList = new ArrayList<>();
        for (Student student : list) {

            if (student.getAge() > 18 && student.getName().indexOf("张") == 0) {
                newList.add(student);
            }
        }
        return newList;
    }
}
