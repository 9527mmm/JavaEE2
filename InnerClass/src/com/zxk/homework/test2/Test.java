package com.zxk.homework.test2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/22/ 21:01
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Test {
    public static void main(String[] args) {
        Pet cat = new Cat("小花", "花猫");
        Pet dog = new Dog("小黑", "黑狗");
        showAdopt(new Person() {
            @Override
            public void adopt(Pet pet) {
                System.out.println("领养了"+pet.getName());
            }
        },dog);
    }

    public static Pet showAdopt(Person person, Pet pet) {
        person.adopt(pet);
        return pet;
    }
}
