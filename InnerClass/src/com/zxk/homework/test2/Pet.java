package com.zxk.homework.test2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/22/ 20:58
 * @Description: 宠物类
 * @GitHup: 957kk
 */
public class Pet {
    private String name;
    /**
     * 品种
     */
    private String breed;

    public Pet() {
    }

    public Pet(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
