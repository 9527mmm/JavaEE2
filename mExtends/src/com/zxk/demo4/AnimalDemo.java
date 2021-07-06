package com.zxk.demo4;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/09/ 11:37
 * @Description:
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Animal a=new Cat();
        a.eat();
        a=new Dog("444",55);
        a.eat();
        System.out.println(a.getAge()+a.getName());
        AnimalOpertor ao=new AnimalOpertor();
        ao.useAnimal(a);

    }
}
