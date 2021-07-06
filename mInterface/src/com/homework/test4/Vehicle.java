package com.homework.test4;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/21/ 19:29
 * @Description: 汽车类
 * @GitHup: 957kk
 */
public abstract class Vehicle {
    /**
     * 品牌
     */
    private String brand;
    /**
     * 价格
     */
    private String price;

    abstract void operation();

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Vehicle() {
    }

    public Vehicle(String brand, String price) {
        this.brand = brand;
        this.price = price;
    }
}
