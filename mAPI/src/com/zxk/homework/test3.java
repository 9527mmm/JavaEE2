package com.zxk.homework;

import java.math.BigDecimal;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/24/ 18:54
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test3 {
    public static void main(String[] args) {

        double[] arr={0.1,0.2,2.1,3.2,5.56,7.21};
        double sum=0.0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(new BigDecimal(sum).divide(BigDecimal.valueOf(arr.length), 2, BigDecimal.ROUND_HALF_UP));


    }
}
