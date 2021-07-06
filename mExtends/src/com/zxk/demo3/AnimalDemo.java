package com.zxk.demo3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/09/ 10:33
 * @Description:
 */
public class AnimalDemo {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        Cat c = new Cat();
        ao.useAnimal(c);


        Dog d = new Dog();
        ao.useAnimal(d);


        //Pig p=new Pig();
        ao.useAnimal(new Pig());
    }

}
