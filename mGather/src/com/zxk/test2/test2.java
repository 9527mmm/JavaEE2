package com.zxk.test2;

import java.util.ArrayList;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/28/ 15:18
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test2 {
    public static void main(String[] args) {


        ArrayList<String> list = getAdd(new ArrayList<String>(), "1", "2", "3");
        for (String s : list) {
            System.out.println(s);
        }
    }


    public static <T> ArrayList<T> getAdd(ArrayList<T> list, T... t) {
        for (T t1 : t) {
            list.add(t1);
        }
        return list;
    }
}
