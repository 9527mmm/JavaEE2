package com.zxk.test2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/28/ 17:07
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        if(this.age-o.age==0){
            return this.name.compareTo(o.getName());
        }else {
            return 0;
        }
    }
}
