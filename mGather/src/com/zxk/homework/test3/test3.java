package com.zxk.homework.test3;

import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/28/ 18:48
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Book> set = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                int result = o1.getPrice() - o2.getPrice();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第" + (i + 1) + "本书的名称");
            String name = sc.next();
            System.out.println("请输入第" + (i + 1) + "本书的价格（整数）");
            int price = sc.nextInt();
            Book book = new Book(name, price);
            set.add(book);
            if (i == 2) {
                break;
            }
            int num = 0;
            while (true) {
                Scanner scc = new Scanner(System.in);
                System.out.println("继续添加请输入1，输入其他将结束");
                try {
                    num = scc.nextInt();
                    break;
                } catch (Exception e) {
                    //e.printStackTrace();
                    System.out.println("非数字请继续");
                }
            }
            if (num == 1) {
                continue;
            } else {
                break;
            }
        }
        System.out.println(set);

    }
}
