package com.zxk.system;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/23/ 17:47
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Test1 {
    public static void main(String[] args) {
        int[] arrary = {2, 5, 3, 6, 8, 9};
        int[] a = new int[10];
        System.arraycopy(arrary, 1, a, 0, 5);






        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);
        }
        //System.exit(5);
        System.out.println("------------------------");
        for (int i = 0; i < arrary.length; i++) {
            System.out.println(arrary[i]);
        }


        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);


    }

}
