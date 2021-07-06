package com.zxk.homework;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/22/ 18:27
 * @Description: 题目一
 * @GitHup: 957kk
 */
class Test {
    public static void main(String[] args) {
        fun(new Cat());//请用子类的形式调用
        fun(()-> System.out.println("匿名猫"));//请用匿名内部类的形式调用
    }

    public static void fun(Animal a) {
        a.show();
    }
}

interface Animal {
    public void show();
}

class Cat implements Animal {
    @Override
    public void show() {
        System.out.println("猫");
    }

}

