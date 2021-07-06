package com.zxk.math;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/23/ 17:28
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println("-----------------------");
        /**
         * 取反
         */
        System.out.println(Math.abs(-1));
        System.out.println("-----------------------");
        /**
         * 取和
         */
        System.out.println(Math.addExact(1, 5));
        System.out.println("-----------------------");
        /**
         * 向上取整
         */
        System.out.println(Math.ceil(10.4));
        /**
         * 向下取整
         */
        System.out.println(Math.floor(10.8));
        System.out.println("-----------------------");
        /**
         * 四舍五入
         */
        System.out.println(Math.round(10.49));
        System.out.println(Math.round(10.51));
        System.out.println("-----------------------");
        /**
         * 返回较大值
         */
        System.out.println(Math.max(1, 5));
        /**
         * 返回较小值
         */
        System.out.println(Math.min(1, 5));

        System.out.println("-----------------------");
        /**
         * 返回a的b次幂
         */
        System.out.println(Math.pow(2, 5));
        System.out.println("-----------------------");
        /**
         * 返回double类型的正随机小数[0.0,1.0)
         */
        System.out.println(Math.random());

        System.out.println("------------------------");

        System.out.println(Math.ulp(0.5));
        System.out.println(Math.ulp(0.4));
    }
}
