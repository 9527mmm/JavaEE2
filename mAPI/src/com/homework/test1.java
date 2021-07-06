package com.homework;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/25/ 18:31
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test1 {
    public static void main(String[] args) {
        System.out.println(getSum(100));
    }
    private static int getSum(int i) {
        if(i==1){
            return 1;
        }else {
            return i+getSum(i-1);
        }
    }
}
