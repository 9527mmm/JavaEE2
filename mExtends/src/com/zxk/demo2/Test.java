package com.zxk.demo2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/08/ 15:08
 * @Description:
 */
public class Test {
    public static void main(String[] args) {


        Student stu1=new Student();
       // stu1.setAge(20);
        stu1.setName("zhangsan");
        System.out.println(stu1.toString());
        System.out.println(stu1.getAge()+","+stu1.getName());
        stu1.study();

        Student stu2=new Student("lisi",21,66);
        System.out.println(stu2.toString());
        stu2.study();
        Person pe=stu1;
        pe.show();
        System.out.println(pe.getAge());
    }
}
