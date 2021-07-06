package com.zxk.homework2;

import java.io.*;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(".\\ioStream\\text1.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        TreeMap<String, String> treeMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i = Integer.parseInt(o1);
                int j = Integer.parseInt(o2);
                return i - j;
            }
        });
        while ((line = br.readLine()) != null) {
            String[] split = line.split(",");
            for (int i = 0; i < split.length; i++) {
                treeMap.put(split[1], split[0]);
            }
        }
        FileWriter fw = new FileWriter(".\\ioStream\\text1.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        Set<String> ss = treeMap.keySet();
        for (String s : ss) {
            bw.write(treeMap.get(s) + "," + s);
            bw.newLine();
            bw.flush();
        }
        bw.close();
    }
}
