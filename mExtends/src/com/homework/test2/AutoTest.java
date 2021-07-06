package com.homework.test2;

import java.util.ArrayList;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 19:45
 * @Description:
 * @GitHup: 957kk
 */
public class AutoTest {
    public static void main(String[] args) {
        SUV s1 = new SUV("aa",4500.0,"50000");
        SUV s2 = new SUV("bb",6000.0,"800000");
        SUV s3 = new SUV("cc",4000.0,"400000");
        ArrayList<SUV> suv=new ArrayList<>();
        suv.add(s1);
        suv.add(s2);
        suv.add(s3);
        for (int i = 0; i < suv.size(); i++) {
            SUV suv1 = suv.get(i);
            suv1.judge(suv1.getVehicle_length());
        }
    }
}
