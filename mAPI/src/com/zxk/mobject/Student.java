package com.zxk.mobject;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/24/ 11:31
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Student {
    private String name;
    private String age;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return age != null ? age.equals(student.age) : student.age == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (age != null ? age.hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }
}
