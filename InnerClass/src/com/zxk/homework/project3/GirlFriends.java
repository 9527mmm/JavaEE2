package com.zxk.homework.project3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/22/ 19:58
 * @Description: TODO
 * @GitHup: 957kk
 */
public class GirlFriends extends Person{
    public void cook(){
        System.out.println("做饭");
    }
    public void wash(Clothes clothes){
        System.out.println(clothes.getBrand()+clothes.getColor()+"洗衣服");
    }

    public GirlFriends(String name, int height) {
        super(name, height);
    }

    public GirlFriends() {
    }
}
