package com.itheima.manay.carDao;

import com.itheima.manay.car.Car;

import java.util.ArrayList;

public class CarDao {
    private static ArrayList<Car> c = new ArrayList<>();
    static{
        Car car1 = new Car("001","宝马",200);
        Car car2 = new Car("002","别克商务车",250);
        Car car3 = new Car("003","金龙",1000);
        c.add(car1);
        c.add(car2);
        c.add(car3);
    }
    public boolean addCar(Car car) {
        return c.add(car);
    }

    public ArrayList<Car> findAllCar() {
        return c;
    }

    public void deleteCar(int index) {
        c.remove(index);
    }

    public void updateCar(String id,Car car) {
        int index = getIndex(id);
        c.set(index,car);
    }
    public int getIndex(String id) {
        int index = -1;
        for (int i = 0; i < c.size(); i++) {
            String id1 = c.get(i).getId();
            if(id.equals(id1)){
                index = i;
                break;
            }
        }
        return index;
    }
}
