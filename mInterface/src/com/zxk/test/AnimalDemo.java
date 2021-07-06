package com.zxk.test;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/09/ 16:28
 * @Description:
 */
public class AnimalDemo {
    public static void main(String[] args) {
        Inter i = new Cat();
        i.show();
         ((Cat) i).eat();
        i.jumpping();
        Animal a = new Cat();
        a.setAge(2);
        a.setName("dsjfh");
        System.out.println(a.getAge() + "-----" + a.getName());
        a.eat();
    }
}
