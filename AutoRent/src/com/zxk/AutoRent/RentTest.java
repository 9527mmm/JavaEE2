package com.zxk.AutoRent;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/23/ 10:35
 * @Description: 测试类
 * @GitHup: 957kk
 */
public class RentTest {
    private static ArrayList<Auto> autos = new ArrayList<>();
    private static ArrayList price = new ArrayList();
    //private static int AllPrice;
    private static int p;
    private static Scanner sc = new Scanner(System.in);
    static {
        Auto a1 = new Auto("宝马", 300);
        Auto a2 = new Auto("别克商务舱", 400);
        Auto a3 = new Auto("金龙（34座）", 800);
        Auto a4 = new truck("解放重卡", 50, 10);
        autos.add(a1);
        autos.add(a2);
        autos.add(a3);
        autos.add(a4);
    }
    public static void main(String[] args) {


        System.out.println("欢迎~~~~~~");

        lo:
        while (true) {
            System.out.println("1，宝马 2，别克商务舱 3，金龙（34）座  4，解放重卡（10t）5，退出");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    getShow(autos, choice);
                    end();
                    break;
                case 2:
                    getShow(autos, choice);
                    end();
                    break;
                case 3:
                    getShow(autos, choice);
                    end();
                    break;
                case 4:
                    getShow(autos, choice);
                    end();
                    break;
                case 5:
                    //getAllPrice(price);
                    System.out.println("总共金额"+p);
                    System.out.println("谢谢使用");
                    break lo;
                default:
                    System.out.println("输入错误，请重输");
            }
        }
    }

    public static void getShow(ArrayList<Auto> autos, int choice) {
        /**
         * 选择使用卡车计算还是汽车
         */
        for (int i = 0; i < autos.size(); i++) {
            if (choice == 4) {
                if (i == 3) {
                    truck a = (truck) autos.get(i);
                    getPrice(a, a.getT());
                }
            } else {
                Auto a = autos.get(i);
                if (a.getBrand().equals(autos.get(choice - 1).getBrand())) {
                    getPrice(a);
                }
            }

        }
    }


    /**
     * @Author: zhaoxuekai
     * @Description: //TODO 卡车
     * @Date: 15:09 2021/6/23 0023
     * @Param: Auto auto,int t
     * @return:
     */
    public static void getPrice(Auto auto, int t) {
        int day = getDay();
        price.add(day * auto.getPrice() * t);
        p += (day * auto.getPrice() * t);

        System.out.println("本次租金"+(day * auto.getPrice() * t));
    }

    /**
     * @Author: zhaoxuekai
     * @Description: //TODO 获取普通汽车租赁价格
     * @Date: 15:09 2021/6/23 0023
     * @Param: Auto auto
     * @return:
     */
    public static void getPrice(Auto auto) {
        int day = getDay();
        price.add(day * auto.getPrice());
        p += day * auto.getPrice();
        System.out.println("本次租金"+(day * auto.getPrice()));
    }


    /**
     * @Author: zhaoxuekai
     * @Description: //TODO 获取租赁天数
     * @Date: 16:20 2021/6/23 0023
     * @Param:
     * @return: int day
     */
    public static int getDay() {
        System.out.println("请输入天数");
        /**
         * 租赁天数
         */
        int day = sc.nextInt();
        return day;
    }

    /**
     * @Author: zhaoxuekai
     * @Description: //TODO 获取总价格
     * @Date: 15:27 2021/6/23 0023
     * @Param:
     * @return:
     */
   /* public static void getAllPrice(ArrayList price) {
        for (int i = 0; i < price.size(); i++) {
            int p = (int) price.get(i);
            AllPrice += p;

        }
        System.out.println("总价是" + AllPrice);
        System.out.println(p);
    }*/

    /**
     * @Author: zhaoxuekai
     * @Description: //TODO 是否结束选择
     * @Date: 16:21 2021/6/23 0023
     * @Param:
     * @return:
     */
    public static void end(){
        System.out.println("是否继续选择，1，继续 2，结束");
        int select=sc.nextInt();
        if(select==2){
            System.out.println("总金额是"+p);
            System.exit(0);
        }
    }
}
