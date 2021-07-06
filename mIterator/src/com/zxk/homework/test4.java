package com.zxk.homework;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/27/ 20:08
 * @Description: TODO
 * @GitHup: 957kk
 */
/*“JavaEE企业级开发指南”，”Oracle高级编程”，”MySQL从入门到精通”，”Java架构师之路”
 **要求:***/
public class test4 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<>();
        list.add("JavaEE企业级开发指南");
        list.add("Oracle高级编程");
        list.add("MySQL从入门到精通");
        list.add("Java架构师之路");
        Iterator<String> it = list.iterator();
        System.out.println("---所有元素如下---");
        for (String s : list) {
            System.out.println(s);
        }
        /*while (it.hasNext()){
            System.out.println(it.next());
        }*/

        //getMin(it);

        //getContains(it);

        //getRemove(it);

    }

    private static void getRemove(Iterator<String> it) {
        System.out.println("---删除包含“Oracle”的元素如下---");

        while (it.hasNext()) {
            String s = it.next();
            boolean b = s.contains("Oracle");
            if (b) {
                it.remove();
            }else {
                System.out.println(s);
            }
        }
    }

    private static void getContains(Iterator<String> it) {
        System.out.println("---书名中包含“Java”的元素如下---");
        while (it.hasNext()) {
            String s = it.next();
            if (s.contains("Java")) {
                System.out.println(s);
            }
        }
    }

    private static void getMin(Iterator<String> it) {
        System.out.println("---书名小于10个字符的元素如下---");
        while (it.hasNext()) {
            String s = it.next();
            if (s.length() < 10) {
                System.out.println(s);
            }
        }
    }
}
