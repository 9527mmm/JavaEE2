package com.zxk.homework;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/28/ 18:39
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test2 {
    public static void main(String[] args) {
        Random ra = new Random();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; ; i++) {
           /* int a=ra.nextInt(21);
           if(a>=10&&a<=20){
               System.out.println("第"+(i+1)+"生成的随机数是"+a);
               set.add(a);
           }*/
            int a = ra.nextInt(11) + 10;
            System.out.println("第" + (i + 1) + "生成的随机数是" + a);
            set.add(a);
            if (set.size() == 8) {
                break;
            }
        }
        System.out.println("集合中保存的8个不重复的随机数" + set);
    }
}
