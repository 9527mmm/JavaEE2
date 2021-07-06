package com.zxk.homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/28/ 8:46
 * @Description: TODO
 * @GitHup: 957kk
 */
public class newwTest4 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList();
        list.add("JavaEE企业级开发指南");
        list.add("Oracle高级编程");
        list.add("MySQL从入门到精通");
        list.add("Java架构师之路");
        Iterator<String> it = list.iterator();
        Add(it);
        TenChar(it);
        Contanins(it);
        Remove(it);


    }

    private static void Remove(Iterator<String> it) {
        while (it.hasNext()) {
            String s = it.next();
            boolean oracle = s.contains("Oracle");
            if (oracle) {
                it.remove();
            } else {
                System.out.println(s);
            }
        }
    }

    private static void Contanins(Iterator<String> it) {
        while (it.hasNext()) {
            String s = it.next();
            boolean java2 = s.contains("Java");
            if (java2) {
                System.out.println(s);
            }
        }
    }

    private static void TenChar(Iterator<String> it) {
        while (it.hasNext()) {
            String next = it.next();
            if (next.length() <= 10) {
                System.out.println(next);
            }
        }
    }

    private static void Add(Iterator<String> it) {
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
