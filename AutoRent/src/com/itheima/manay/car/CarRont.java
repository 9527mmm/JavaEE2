package com.itheima.manay.car;

public class CarRont {
    private String brand;
    private int dayNum;
    private int num;

    public CarRont() {
    }

    public CarRont(String brand, int dayNum,int num) {
        this.brand = brand;
        this.dayNum = dayNum;
        this.num = num;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDayNum() {
        return dayNum;
    }

    public void setDayNum(int dayNum) {
        this.dayNum = dayNum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
