package com.zxk.set.hashSet.homework.test1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/29/ 18:36
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("赵丽颖",18);
        Person p2 = new Person("杨幂",19);
        Person p3 = new Person("范冰冰",20);

        HashSet<Person> hashSet = new HashSet<>();
        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        System.out.println(hashSet);

        TreeSet<Person> treeSet = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int result=o1.getAge()-o2.getAge();
               result=result==0?o1.getName().compareTo(o2.getName()):result;
                return result;
            }
        });
        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);
        System.out.println(treeSet);
    }
}
