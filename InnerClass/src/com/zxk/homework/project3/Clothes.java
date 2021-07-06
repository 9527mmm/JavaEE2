package com.zxk.homework.project3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/22/ 19:58
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Clothes {
    private String brand;
    private String color;

    @Override
    public String toString() {
        return "Clothes{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Clothes() {
    }

    public Clothes(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }
}
