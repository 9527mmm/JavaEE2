package com.zxk.homework.Test3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/22/ 21:25
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Pet implements PlayGame{
    private int health=100;
    private int intimacy=50;
   public static Pet getPlay( Pet pet){
       pet.play();
       return pet;
   }

    @Override
    public void play() {
       health+=10;
        System.out.println(health);
       intimacy-=5;
        System.out.println(intimacy);

    }
}
