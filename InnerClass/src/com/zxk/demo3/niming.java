package com.zxk.demo3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/10/ 15:31
 * @Description:
 **/
public class niming {
    public static void main(String[] args) {
        //接口中只有一个方法
        new Interr() {
            @Override
            public void show() {
                System.out.println("匿名内部类的单个方法调用");
            }
        }.show();
        //当接口中有多个方法

        Inter i = new Inter() {

            @Override
            public void show1() {
                System.out.println("第一个方法");
            }

            @Override
            public void show2() {
                System.out.println("第二个方法");
            }
        };
        i.show1();
        i.show2();

    }
}

interface Interr {
    void show();

}


interface Inter {
    void show1();

    void show2();
}

class inner implements Inter {


    @Override
    public void show1() {
        System.out.println("imp 重写show2");
    }

    @Override
    public void show2() {
        System.out.println("imp,重写show2");
    }
}