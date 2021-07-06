package com.zxk.set.hashSet.homework.newTest3;

import java.util.HashSet;
import java.util.Random;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/29/ 19:05
 * @Description: TODO
 * @GitHup: 957kk
 */
public class newMember implements Comparable<newMember> {
    private String vipNumber;
    private String name;
    private String phone;
    private String IDCard;
    private static HashSet<String> hashSet = new HashSet<>();

    public newMember(String vipNumber, String name, String phone, String IDCard) {

        this.vipNumber = vipNumber;
        this.name = name;
        this.phone = phone;
        this.IDCard = IDCard;
    }

    public newMember() {
        /**
         * 判断自动生成的会员号是否重复
         */
        String vip;
        while (true) {
            Random ra = new Random();
            vip = "" + ra.nextInt(10) + ra.nextInt(10) + ra.nextInt(10);
            if (!hashSet.add(vip)) {
                throw new aaa("会员号重复异常");
            } else {
                this.vipNumber = vip;
                break;
            }
        }

    }

    public String getVipNumber() {
        return vipNumber;
    }

    public void setVipNumber(String vipNumber) {
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

    public boolean setIDCard(String IDCard) {
        /**
         * 判断身份证是否重复
         */
        if (!hashSet.add(IDCard)) {
            System.out.println("请重输");
            return false;
        }
        this.IDCard = IDCard;
        return true;
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
    public int compareTo(newMember o) {
        int result = Integer.parseInt(this.vipNumber) - Integer.parseInt(o.vipNumber);
        result = result == 0 ? this.IDCard.compareTo(o.IDCard) : result;
        return result;
    }

}
