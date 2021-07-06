package com.zxk.homework;

import java.io.*;
import java.util.Comparator;
import java.util.TreeSet;

public class Test6 {
    public static void main(String[] args) throws IOException {
        File file = new File(".\\ioStream\\sort.txt");
        FileInputStream fis = new FileInputStream(file);

        TreeSet<Integer> treeSet = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        byte[] bytes = new byte[(int) file.length()];
        fis.read(bytes);
        String s = new String(bytes, "UTF-8");
        System.out.println(s);
        String[] split = s.split("\r\n");
        for (String s1 : split) {
            String[] split1 = s1.split(",");
            int i = Integer.parseInt(split1[1]);
            treeSet.add(i);
        }
        fis.close();
        FileOutputStream fos = new FileOutputStream(".\\ioStream\\sort.txt");
        for (Integer integer : treeSet) {
            for (String s1 : split) {
                if (s1.contains(integer.toString())) {
                    fos.write(s1.getBytes());
                    fos.write("\r\n".getBytes());
                }
            }

            System.out.println(integer);
        }

        fos.close();
    }
}
