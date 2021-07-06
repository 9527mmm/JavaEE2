package com.iteratoor.test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/27/ 16:50
 * @Description: TODO
 * @GitHup: 957kk
 */
public class test1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        String s1 = "a";
        String s2 = "b";
        String s3 = "b";
        list.add(s1);
        list.add(s2);
        list.add(s3);
       /* for (int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i).equals("b")){
                list.remove("b");
            }
        }*/

        /*  list.removeIf(s-> s.equals("b"));*/

       /* Iterator<String> it= list.iterator();
        while (it.hasNext()){
            if(it.next().equals("b")){
                it.remove();
            }
        }*/
        for (String s : list) {
            if (s.equals("b")) {
                list.remove(s);
                return;
            }
            System.out.println(s);
        }


        //slist.forEach(s -> System.out.println(s));

    }
}
