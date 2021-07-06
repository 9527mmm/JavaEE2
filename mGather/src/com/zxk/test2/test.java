package com.zxk.test2;

import java.util.ArrayList;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/28/ 16:01
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test {
    public static void main(String[] args) {

        ArrayList<a> list1 = new ArrayList<>();
        ArrayList<b> list2 = new ArrayList<>();
        ArrayList<c> list3 = new ArrayList<>();

//extends 本身或者子类
        // add1(list1);错误
        add1(list2);
        add1(list3);
//super  本身或父类
        add2(list1);
        add2(list2);
        //add2(list3);
    }

    public static void add1(ArrayList<? extends b> list) {

    }

    public static void add2(ArrayList<? super b> list) {

    }

    class a {
    }

    class b extends a {
    }

    class c extends b {
    }
}
