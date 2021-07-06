package com.itheima.manay.carContorller;

import com.itheima.manay.car.Car;
import com.itheima.manay.car.CarRont;
import com.itheima.manay.carDao.CarDao;
import com.itheima.manay.carService.CarRontService;
import com.itheima.manay.carService.CarService;
import com.itheima.manay.carService.OtherCarRontService;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class CarRontContorller {
    private CarDao carDao = new CarDao();
    private CarContorller carContorller = new CarContorller();
    private OtherCarRontService carRontService = new OtherCarRontService();
    private Scanner sc = new Scanner(System.in);
    private String id;
    private int dayNum;

    public void start() {
        lo:
        while (true) {
            System.out.println("------欢迎来到汽车租赁系统------");
            carContorller.findAllCar();
            System.out.println("请输入你的选择：1.汽车租赁 2.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    addCarRont();
                    break;
                case "2":
                    System.out.println("感谢您的使用，再见！");
                    break lo;
                default:
                    System.out.println("您的输入有误请重新输入：");
                    break;
            }
        }
    }

    public void addCarRont() {
        int sunMoney = 0;
        lo:
        while (true) {
            sunMoney += rontCar();
            System.out.println("请输入你的选择：1.继续添加 2.结束");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    break;
                case "2":
                    break lo;
                default:
                    System.out.println("您的输入有误，请重新输入：");
                    break;
            }
        }
        System.out.println("您的汽车租赁情况如下：");
        System.out.println("品牌\t\t租赁数量\t\t租赁天数");
        ArrayList<CarRont> allCarRont = carRontService.findAllCarRont();
        for (int i = 0; i < allCarRont.size(); i++) {
            CarRont carRont = allCarRont.get(i);
            System.out.println(carRont.getBrand()+"\t\t"+carRont.getNum()+"辆\t\t"+carRont.getDayNum()+"天");
        }
        System.out.println("你的租金共：" + sunMoney + "元");
    }

    public int rontCar() {
        System.out.println("请输入您要租赁的汽车品牌：");
        String brand = sc.next();
        System.out.println("请输入你要租赁该品牌车辆的数量：");
        int num = sc.nextInt();
        System.out.println("请输入你要租赁的天数：");
        dayNum = sc.nextInt();
        CarRont carRont = new CarRont(brand, dayNum, num);
        carRontService.addCarRont(carRont);
        return carRontService.money();
    }
}
