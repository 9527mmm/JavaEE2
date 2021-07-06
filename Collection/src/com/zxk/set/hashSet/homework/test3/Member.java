package com.zxk.set.hashSet.homework.test3;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/29/ 19:05
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Member implements Comparable<Member> {
    private int vipNumber;
    private String name;
    private String phone;
    private String IDCard;

    public Member(int vipNumber, String name, String phone, String IDCard) {

        this.vipNumber = vipNumber;
        this.name = name;
        this.phone = phone;
        this.IDCard = IDCard;
    }

    public Member() {
        Random ra = new Random();
        int vip;
        while (true) {
            vip = ra.nextInt(899)+100;
            HashSet<String> hashSet = new HashSet<>();
            if (!hashSet.add(String.valueOf(vip))) {
                throw new RuntimeException("会员号重复异常");
            } else {
                break;
            }
        }
        this.vipNumber = vip;
    }

    public int getVipNumber() {
        return vipNumber;
    }

    public void setVipNumber(int vipNumber) {
        this.vipNumber = vipNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard;
    }

    @Override
    public String toString() {
        return "Member{" +
                "vipNumber=" + vipNumber +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", IDCard='" + IDCard + '\'' +
                '}';
    }

    @Override
    public int compareTo(Member o) {
        int result = this.vipNumber - o.vipNumber;
        result = result == 0 ? this.IDCard.compareTo(o.IDCard) : result;
        return result;
    }

}
