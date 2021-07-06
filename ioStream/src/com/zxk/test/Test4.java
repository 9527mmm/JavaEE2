package com.zxk.test;

import java.io.*;
import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(".\\ioStream\\sort.txt"));
        String s = br.readLine();
        br.close();
        String[] s1 = s.split(" ");
        int[] arr = new int[s1.length];
        for (int i = 0; i < s1.length; i++) {
            int i1 = Integer.parseInt(s1[i]);
            arr[i] = i1;
        }
        Arrays.sort(arr);
        BufferedWriter bw = new BufferedWriter(new FileWriter(".\\ioStream\\sort.txt"));
        for (int i = 0; i < arr.length; i++) {
            bw.write(arr[i] + " ");
            bw.flush();
        }
        bw.close();

    }
}
