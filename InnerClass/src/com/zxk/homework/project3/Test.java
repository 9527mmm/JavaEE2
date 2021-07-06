package com.zxk.homework.project3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/22/ 19:58
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Test {
    public static void main(String[] args) {
        GirlFriends girlFriends=new GirlFriends("张三",165);
        BoyFriends boyFriends = new BoyFriends("李四",170);
        boyFriends.getMoney();
        boyFriends.shopping(girlFriends);
        girlFriends.cook();
        girlFriends.wash(new Clothes("三菱","白色"));
    }
}
