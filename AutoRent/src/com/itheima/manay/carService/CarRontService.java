package com.itheima.manay.carService;

import com.itheima.manay.car.Car;
import com.itheima.manay.car.CarRont;
import com.itheima.manay.carDao.CarDao;
import com.itheima.manay.carDao.CarRontDao;

import java.util.ArrayList;

public class CarRontService {
    private CarDao carDao = new CarDao();
    private CarRontService carRontService = new CarRontService();
    private CarRontDao carRontDao = new CarRontDao();
    public void addCarRont(CarRont carRont) {
        carRontDao.addCarRont(carRont);
    }

    public ArrayList<CarRont> findAllCarRont() {
        return carRontDao.findAllCarRont();
    }
    public int money() {
        ArrayList<Car> allCar = carDao.findAllCar();
        ArrayList<CarRont> allCarRont = carRontService.findAllCarRont();
        int money = 0;
        for (int i = 0; i < allCar.size(); i++) {
            for (int i1 = 0; i1 < allCarRont.size(); i1++) {
                Car car = allCar.get(i);
                CarRont carRont = allCarRont.get(i1);
                if (car.getBrand().equals(carRont.getBrand())) {
                    money += car.getMoney() * carRont.getDayNum() * carRont.getNum();
                }
            }
        }
        return money;
    }
}
