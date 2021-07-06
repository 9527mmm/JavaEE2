package com.zxk.homework;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/24/ 19:50
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test6 {
    public static void main(String[] args) {
        int sum=getSum(100);
        System.out.println(sum);
    }
    public static int getSum(int s){
       if(s==1){
           return 1;
       }else {
           return s + getSum(s - 1);
       }
    }
}
