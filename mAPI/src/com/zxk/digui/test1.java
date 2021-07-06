package com.zxk.digui;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/24/ 20:13
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test1 {
    public static void main(String[] args) {

        int s=getSSS(4);
        System.out.println(s);
    }

    private static int getSSS(int i) {
        if(i==1){
            return 1;
        }else {
            return i*getSSS(i-1);
        }
    }
}
