package com.zxk.demo3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/10/ 16:06
 * @Description:
 **/
public class test {
    public static void main(String[] args) {


        goSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("去游泳吧");
            }
        });


        goSwimming(() -> {
            System.out.println("lambda去游泳");
        });
    }

    public static void goSwimming(Swimming swimming) {
        swimming.swim();
    }
}

interface Swimming {
    void swim();
}