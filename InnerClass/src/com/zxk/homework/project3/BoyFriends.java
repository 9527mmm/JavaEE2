package com.zxk.homework.project3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/22/ 19:58
 * @Description: TODO
 * @GitHup: 957kk
 */
public class BoyFriends extends Person{
    public void getMoney(){
        System.out.println("赚钱");
    }
    public void shopping(GirlFriends girlFriends){

        System.out.println(girlFriends.getName()+"花钱");
    }

    public BoyFriends(String name, int height) {
        super(name, height);
    }

    public BoyFriends() {
    }
}
