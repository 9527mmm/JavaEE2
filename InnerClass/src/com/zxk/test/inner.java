package com.zxk.test;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/10/ 14:35
 * @Description:
 **/
public class inner {
    public static void main(String[] args) {

    /*   私有化的调用
         Outer i = new Outer();

        i.method();*/

/*
//静态调用
        Outer.Inner in = new Outer.Inner();
        System.out.println(in.a);
        in.show();
*/

        //普通调用
        Outer.Inner inn=new Outer().new Inner();
        inn.show();
        System.out.println(inn.a);



        Outerr.Inner.show();//直接类名.方法名()调用
    }


}

/*
class Outer {
//私有化内部类
    private class Inner {
        int a = 10;
        public void show() {
            System.out.println("内部类");
        }
    }
    public void method(){
        Inner i=new Inner();
        i.show();
        System.out.println(i.a);
    }
}*/

/*class Outer {

    static class Inner {
        int a = 10;

        public void show() {
            System.out.println("内部类");
        }
    }

}*/

class Outer {

     class Inner {
        int a = 10;

        public void show() {
            System.out.println("内部类");
        }
    }

}
class Outerr {

    static class Inner {
        int a = 10;

        public static void show() {
            System.out.println("私有内部类的私有方法");
        }
    }
}