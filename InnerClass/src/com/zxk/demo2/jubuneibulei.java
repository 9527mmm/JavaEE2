package com.zxk.demo2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/10/ 15:12
 * @Description:
 **/
public class jubuneibulei {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.show();
    }
}
class Outer{
    public void show(){
        class Inner{
            public void method(){
                System.out.println("局部内部类的调用");
            }
        }
        Inner i=new Inner();
        i.method();
    }
}