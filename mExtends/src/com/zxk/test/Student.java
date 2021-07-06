package com.zxk.test;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/08/ 10:44
 * @Description:
 */
public class Student extends Person {
    String name = "ZXK";


    @Override
    public void show() {
        String name = "show,局部";
        System.out.println(name);
        System.out.println(this.name);
        super.call();
        super.setName("父类");
        System.out.println(super.getName());
    }
}
