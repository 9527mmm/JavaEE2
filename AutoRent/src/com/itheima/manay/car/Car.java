package com.itheima.manay.car;

public class Car {
    private String id;
    private String brand;
    private int money;
    public Car() {
    }

    public Car(String id,String brand, int money) {
        this.id = id;
        this.brand = brand;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
