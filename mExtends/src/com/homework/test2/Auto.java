package com.homework.test2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 19:34
 * @Description:
 * @GitHup: 957kk
 */
public class Auto {
    /**
     * 品牌
     */
    private String brand;
    /**
     * 车长
     */
    private double vehicle_length;
    /**
     * 价格
     */
    private String price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getVehicle_length() {
        return vehicle_length;
    }

    public void setVehicle_length(double vehicle_length) {
        this.vehicle_length = vehicle_length;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Auto(String brand, double vehicle_length, String price) {
        this.brand = brand;
        this.vehicle_length = vehicle_length;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "brand='" + brand + '\'' +
                ", vehicle_length=" + vehicle_length +
                ", price='" + price + '\'' +
                '}';
    }

    public Auto() {
    }
}
