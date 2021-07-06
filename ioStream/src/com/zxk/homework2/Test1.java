package com.zxk.homework2;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(".\\ioStream\\窗里窗外.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        long start = System.currentTimeMillis();
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
        long end = System.currentTimeMillis();
        System.out.println("读取文件共使用了" + (end - start) + "毫秒");
    }
}
