package com.zxk.test;

import java.util.ArrayList;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/02/ 14:49
 * @Description:
 */
public class TestStudent {
    public static void main(String[] args) {
        /**
         4. 分析一下需求，并用代码实现

         1. 定义一个Student类，属性有姓名（String类型），语文考试成绩（int类型），数学成绩（int），
         生成对应的set/get方法以及空参，满参构造,show方法（例如：张三的语文成绩是100分，数学成绩是80分，总分是180分。）
         2. 创建好三个对象,讲对象存入ArrayList\<Student>中，在集合中查找总分大于160分的学生，存入新集合，最后输出新集合*/

        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三", 100, 80);
        Student stu2 = new Student("李四", 100, 60);
        Student stu3 = new Student("王五", 90, 90);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        show(list);

        ArrayList<Student> list1 = select(list);
        for (int i = 0; i < list1.size(); i++) {
            Student student = list1.get(i);
            System.out.println(student.getName());
        }

    }

    public static void show(ArrayList<Student> list) {

        for (int i = 0; i < list.size(); i++) {
            Student temp = list.get(i);
            System.out.println(temp.getName() + "的语文成绩是" + temp.getYuwen() + "分，数学成绩是" + temp.getMath() + "分" + "总分是" + (temp.getMath() + temp.getYuwen()));
        }

    }

    public static ArrayList<Student> select(ArrayList<Student> list) {

        String s="123";
        String b="123";
        String e=new String("123");
        char c[]={'1','2','3'};
        System.out.println(s.equals(b));
        System.out.println(b.equals(c));
        System.out.println(b.equals(e));
       // System.out.println(b==c);



        ArrayList<Student> list2 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Student temp = list.get(i);
            if ((temp.getYuwen() + temp.getMath()) > 160) {
                list2.add(temp);
            }
        }
        return list2;

    }

}
