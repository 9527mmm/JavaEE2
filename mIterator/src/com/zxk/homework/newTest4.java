package com.zxk.homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/27/ 20:08
 * @Description: TODO
 * @GitHup: 957kk
 */
/*“JavaEE企业级开发指南”，”Oracle高级编程”，”MySQL从入门到精通”，”Java架构师之路”
 **要求:***/
public class newTest4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
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


        System.out.println("---书名小于10个字符的元素如下---");
        /*for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if(s.length()<10){
                System.out.println(s);
            }
        }*/
        while (it.hasNext()) {
            if (it.next().length() < 10) {
                System.out.println(it.next());
            }

        }

        System.out.println("---书名中包含“Java”的元素如下---");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.indexOf("Java") >= 0) {
                System.out.println(s);
            }
        }


        System.out.println("---删除包含“Oracle”的元素如下---");
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if (s.indexOf("Oracle") >= 0) {
                list.remove(s);
            }
        }
        for (String s : list) {
            System.out.println(s);
        }

    }
}
