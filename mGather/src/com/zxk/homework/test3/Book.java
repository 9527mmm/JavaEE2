package com.zxk.homework.test3;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/28/ 18:49
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Book() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

   /* @Override
    public int compareTo(Book o) {
        int result=o.price-this.price;
        result=result==0? o.name.compareTo(this.name):result;
        return result;
    }*/
}

