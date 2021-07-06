package com.zxk.AutoRent;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/23/ 10:54
 * @Description: TODO
 * @GitHup: 957kk
 */
public class truck extends Auto {
    private int t;

    public truck() {
    }

    ;

    public truck(String brand, int price, int t) {
        super(brand, price);
        this.t = t;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "truck{" +
                "t=" + t +
                '}';
    }
}
