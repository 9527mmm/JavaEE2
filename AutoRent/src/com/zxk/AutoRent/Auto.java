package com.zxk.AutoRent;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/23/ 10:30
 * @Description: 汽车类
 * @GitHup: 957kk
 */
public class Auto {
    /**
     * 品牌
     */
    private String brand;
    /**
     * 租金
     */
    private int rental;

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", price='" + rental + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return rental;
    }

    public void setPrice(int price) {
        this.rental = price;
    }

    public Auto() {
    }

    public Auto(String brand, int price) {
        this.brand = brand;
        this.rental = price;
    }
}
