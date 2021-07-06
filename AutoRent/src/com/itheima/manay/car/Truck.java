package com.itheima.manay.car;

public class Truck extends Car {
    private  int weight;

    public Truck(int weight) {
        this.weight = weight;
    }

    public Truck(String id, String brand, int money, int weight) {
        super(id, brand, money);
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
