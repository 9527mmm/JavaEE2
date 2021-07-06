package com.itheima.manay.carDao;

import com.itheima.manay.car.CarRont;

import java.util.ArrayList;

public class CarRontDao {
    private static ArrayList<CarRont> cr = new ArrayList<>();

    public void addCarRont(CarRont carRont) {
        cr.add(carRont);
    }

    public ArrayList<CarRont> findAllCarRont() {
        return cr;
    }
}
