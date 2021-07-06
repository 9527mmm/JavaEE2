package com.zxk.homework;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/28/ 18:30
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test1 {
    public static void main(String[] args) {
        double[] arr={2.2,5.5,6.6,2.2,8.8,1.1,2.2,8.8,5.5,2.2,6.6};
        HashSet<String> s=new HashSet<>();
        s.add("a");
        s.add("z");
        s.add("a");
        s.add("d");
        s.add("c");
        for (String s1 : s) {
            System.out.println(s1);
        }
        Set<Double> list= new HashSet<>();
        for (double v : arr) {
            list.add(v);
        }
        System.out.println(list);
    }
}
