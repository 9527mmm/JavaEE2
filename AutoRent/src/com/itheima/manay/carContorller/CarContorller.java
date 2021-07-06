package com.itheima.manay.carContorller;

import com.itheima.manay.car.Car;
import com.itheima.manay.carService.CarService;

import java.util.ArrayList;
import java.util.Scanner;

public class CarContorller {
    private CarService carService = new CarService();
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Car> allCar = carService.findAllCar();
    private String id;
    public  void start() {
        lo:while (true) {
            System.out.println("------欢迎来到汽车信息管理系统------");
            System.out.println("请输入你的选择：1.添加信息 2.修改信息 3.删除信息 4.查看信息 5.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addCar();
                    break;
                case "2":
                    updateCar();
                    break;
                case "3":
                    deleteCar();
                    break;
                case "4":
                    findAllCar();
                    break;
                case "5":
                    System.out.println("感谢您的使用，再见！");
                    break lo;
                default:
                    System.out.println("您的输入有误，请重新输入");
                    break;
            }
        }
    }

    public void updateCar() {
        if(allCar.size() == 0){
            System.out.println("查无信息，请添加后重试");
            return;
        }else{
            while(true){
                System.out.println("请输入汽车编号：");
                id = sc.next();
                boolean exists = carService.isExists(id);
                if(!exists){
                    System.out.println("您输入的编号不存在，请重新输入");
                }else {
                    break;
                }
            }
            System.out.println("请输入汽车品牌：");
            String brand = sc.next();
            System.out.println("请输入汽车租金");
            int money = sc.nextInt();
            Car car = new Car(id,brand,money);
            carService.updateCar(id,car);
            System.out.println("修改成功");
        }
    }

    public void deleteCar() {
        if(allCar.size() == 0){
            System.out.println("查无信息，请添加后重试");
            return;
        }else{
            while(true){
                System.out.println("请输入汽车编号：");
                id = sc.next();
                boolean exists = carService.isExists(id);
                if(!exists){
                    System.out.println("您输入的编号不存在，请重新输入");
                }else {
                    break;
                }
            }
            carService.deleteCar(id);
            System.out.println("删除成功");
        }
    }

    public void findAllCar() {
        if(allCar.size() == 0){
            System.out.println("查无信息，请添加后重试");
            return;
        }else{
            System.out.println("编号\t\t品牌\t\t租金（每日）");
            for (int i = 0; i < allCar.size(); i++) {
                Car car = allCar.get(i);
                System.out.println(car.getId() + "\t\t"+ car.getBrand() + "\t\t"+ car.getMoney());
            }
        }
    }

    public  void addCar() {
        while (true){
            System.out.println("请输入汽车编号：");
            id = sc.next();
            boolean flag = carService.isExists(id);
            if(flag){
                System.out.println("您输入的编号已被占用，请重新输入");
            }else{
                break;
            }
        }
        System.out.println("请输入汽车品牌：");
        String brand = sc.next();
        System.out.println("请输入汽车租金");
        int money = sc.nextInt();
        Car car = new Car(id,brand,money);
        boolean result  = carService.addCar(car);
        if(result){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }
}
