package com.zxk.test2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/28/ 16:19
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test1 {
    public static void main(String[] args) {
        Set<Student> set=new TreeSet<>();
        set.add(new Student("zhangsan",18));
        set.add(new Student("lisi",18));
        set.add(new Student("zhangsan",20));
        System.out.println(set);

    }
}
