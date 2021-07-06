package com.zxk.set.hashSet.homework.newTest3;

import com.zxk.set.hashSet.homework.newTest3.newMember;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/29/ 19:03
 * @Description: TODO
 * @GitHup: 957kk
 */
public class newTest3 {
    private static HashSet<String> id=new HashSet<>();
    public static void main(String[] args) {

        TreeSet<newMember> set = new TreeSet<>();
        while (true) {
            newMember member = null;
            try {
                member = new newMember();
            } catch (Exception e) {
                System.out.println("会员号重复");
                continue;
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入姓名");
            String name = sc.next();
            System.out.println("请输入电话");
            String phone = sc.next();

            member.setName(name);
            member.setPhone(phone);
            while (true){
                System.out.println("请输入身份证号");
                String idcard=sc.next();
                boolean result=member.setIDCard(idcard);
                if(result){
                    break;
                }
            }
            set.add(member);
            if (set.size() == 3) {
                break;
            }
        }
        System.out.println(set);
    }
}
