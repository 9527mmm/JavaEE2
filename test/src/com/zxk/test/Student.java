package com.zxk.test;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/02/ 14:47
 * @Description:
 */
public class Student {
    /**
     4. 分析一下需求，并用代码实现

     1. 定义一个Student类，属性有姓名（String类型），语文考试成绩（int类型），数学成绩（int），
     生成对应的set/get方法以及空参，满参构造,show方法（例如：张三的语文成绩是100分，数学成绩是80分，总分是180分。）
     2. 创建好三个对象,讲对象存入ArrayList\<Student>中，在集合中查找总分大于160分的学生，存入新集合，最后输出新集合*/
    private String name;
    private int yuwen;
    private  int math;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYuwen() {
        return yuwen;
    }

    public void setYuwen(int yuwen) {
        this.yuwen = yuwen;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public Student(String name, int yuwen, int math) {
        this.name = name;
        this.yuwen = yuwen;
        this.math = math;
    }

    public Student() {
    }

}
