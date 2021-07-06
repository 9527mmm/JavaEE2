package com.itheima.manay.carService;

import com.itheima.manay.car.Car;
import com.itheima.manay.carDao.CarDao;

import java.util.ArrayList;

public class CarService {

    private CarDao carDao = new CarDao();
    private ArrayList<Car> allCar = carDao.findAllCar();
    public boolean addCar(Car car) {
        return carDao.addCar(car);
    }

    public ArrayList<Car> findAllCar() {
        return allCar;
    }

    public boolean isExists(String id) {
        boolean result = false;
        for (int i = 0; i < allCar.size(); i++) {

            Car car = allCar.get(i);
            if(id.equals(car.getId())){
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean deleteCar(String id) {
        int index = carDao.getIndex(id);
        boolean flag = false;
        if(index!=-1){
            carDao.deleteCar(index);
            flag = true;
        }
        return flag;
    }



    public void updateCar(String id, Car car) {
        carDao.updateCar(id,car);
    }
}
