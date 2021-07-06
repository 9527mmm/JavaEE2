package com.zxk.set.hashSet.homework.test3;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/29/ 19:03
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Test3 {
    public static void main(String[] args) {

        TreeSet<Member> set = new TreeSet<>();
        while (true) {
            Member member = new Member();
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入姓名");
            String name = sc.next();
            System.out.println("请输入电话");
            String phone = sc.next();
            System.out.println("请输入身份证号");
            String idcard = sc.next();

            member.setName(name);
            member.setPhone(phone);
            member.setIDCard(idcard);
            set.add(member);
            if (set.size() == 3) {
                break;
            }
        }
        System.out.println(set);
    }
}
