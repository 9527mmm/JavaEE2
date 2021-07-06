package com.zxk.set.hashSet.homework;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/29/ 18:50
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Test2 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入菜名");
            String a=sc.next();
            hashSet.add(a);
            int num= 0;
            try {
                System.out.println("输入整数1继续，其他整数结束");
                num = sc.nextInt();
                continue;
            } catch (Exception e) {
                System.out.println("输入不是整数");
            }
            if(num!=1){
                break;
            }
        }
        System.out.println(hashSet);
    }
}
