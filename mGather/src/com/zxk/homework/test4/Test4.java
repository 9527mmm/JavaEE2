package com.zxk.homework.test4;

import java.util.*;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/28/ 19:08
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Test4 {
    public static void main(String[] args) {
        Set<Country> set1 = getCountries();
        Set<Country> set2 = getCountries();
        Set<Country> set3 = getCountries();
        Set<Country> set4 = getCountries();
        Set<Country> set5 = getCountries();

        ArrayList<Object> objects = new ArrayList<>();
        Set<Country> set = new TreeSet<>(new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                int result = o1.getInitial() - o2.getInitial();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                if (o1.getInitial() >= 'A' && o1.getInitial() <= 'F') {
                    set1.add(o1);
                } else if (o1.getInitial() >= 'G' && o1.getInitial() <= 'J') {
                    set2.add(o1);
                } else if (o1.getInitial() >= 'K' && o1.getInitial() <= 'N') {
                    set3.add(o1);
                } else if (o1.getInitial() >= 'P' && o1.getInitial() <= 'V') {
                    set4.add(o1);
                } else if (o1.getInitial() >= 'W' && o1.getInitial() <= 'Z') {
                    set5.add(o1);
                }
                return result;
            }
        });
        Country c1 = new Country("中国", 'Z');
        Country c2 = new Country("美国", 'M');
        Country c3 = new Country("俄国", 'E');
        Country c4 = new Country("阿富汗", 'A');
        Country c5 = new Country("日本", 'R');
        Country c6 = new Country("泰国", 'T');
        Country c7 = new Country("尼泊尔", 'N');
        Country c8 = new Country("捷克", 'J');
        Country c9 = new Country("荷兰", 'H');
        Country c10 = new Country("克罗地亚", 'K');


        set.add(c1);
        set.add(c2);
        set.add(c3);
        set.add(c4);
        set.add(c5);
        set.add(c6);
        set.add(c7);
        set.add(c8);
        set.add(c9);
        set.add(c10);

        System.out.println(set);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
        System.out.println(set4);
        System.out.println(set5);
    }

    private static Set<Country> getCountries() {
        return new TreeSet<Country>(new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                int result = o1.getInitial() - o2.getInitial();
                result = result == 0 ? o1.getName().compareTo(o2.getName()) : result;
                return result;
            }
        });
    }
}
