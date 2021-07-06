package com.homework.test5;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/25/ 20:50
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Things {
    private String name;
    private int amount;
    private String startTime;
    private String endTime;

    public Things(String name, int amount, String startTime, String endTime) {
        this.name = name;
        this.amount = amount;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Things{" +
                "商品名称='" + name + '\'' +
                ", 库存数量=" + amount +
               /* ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +*/
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Things() {
    }
}

