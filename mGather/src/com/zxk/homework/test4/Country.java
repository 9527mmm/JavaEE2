package com.zxk.homework.test4;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/28/ 19:10
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Country {

    private String name;
    /**
     * 首字母
     */
    private Character initial;

    public Country(String name, Character initial) {
        this.name = name;
        this.initial = initial;
    }

    public Country() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getInitial() {
        return initial;
    }

    public void setInitial(Character initial) {
        this.initial = initial;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                '}';
    }
}
