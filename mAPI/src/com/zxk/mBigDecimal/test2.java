package com.zxk.mBigDecimal;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/24/ 15:59
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test2 {
    public static void main(String[] args) {

        String s1="91 227 46 38 50";
        String[] s2=s1.split(" ");
        int[] ints=new int[s2.length];
        for (int i = 0; i < s2.length; i++) {
            //System.out.println(s2[i]);
            ints[i]=Integer.parseInt(s2[i]);
            System.out.println(ints[i]);
        }
    }
}
