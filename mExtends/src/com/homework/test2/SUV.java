package com.homework.test2;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/20/ 19:36
 * @Description:
 * @GitHup: 957kk
 */
public class SUV extends Auto {
    private final double SMALL = 4295.0;
    private final double MIDDLE = 5070.0;


    /**
     * @Author: zhaoxuekai
     * @Description: //TODO 判断车长是否为中型车
     * @Date: 9:57 2021/6/21 0021
     * @Param: l，车长
     * @return: 无
     */
    public void judge(double l){
        if(l>SMALL&&l<+MIDDLE){
            System.out.println("车型：SUV");
            System.out.println("    价格："+this.getPrice());
            System.out.println("    车长："+this.getVehicle_length());
        }
    }

    public SUV(String brand, double vehicle_length, String price) {
        super(brand, vehicle_length, price);
    }

    public SUV() {
    }

}
