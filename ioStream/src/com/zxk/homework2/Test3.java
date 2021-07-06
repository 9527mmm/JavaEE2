package com.zxk.homework2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Test3 {
    public static void main(String[] args) throws IOException {
        int j = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        HashMap<Integer, String> hashMap = new HashMap<>();
        FileReader fr = new FileReader(".\\ioStream\\学生姓名.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        for (int i = 0; (line = br.readLine()) != null; i++) {
            hashMap.put(i, line);
        }
        System.out.println(hashMap);
        Set<Integer> keySet = hashMap.keySet();
        for (int i = 1; ; i++) {
            for (Integer integer : keySet) {
                Scanner sc = new Scanner(System.in);
                System.out.println("回车查看下一位，over结束");
                String word = sc.nextLine();
                int a;
                if (word.equals("over")) {
                    break;
                }
                Random ra = new Random();
                for (int c = 1; c < hashMap.size(); c++) {
                    a = ra.nextInt(6);
                    integer = a;
                    if (hashSet.add(integer)) {
                        j++;
                        System.out.println("今日第" + j + "位幸运学生是：" + hashMap.get(integer));
                        if (hashSet.size() == 6) {
                            System.out.println("全部显示完毕，结束程序");
                            System.exit(0);
                        }
                        break;
                    }
                }
            }
        }
    }
}
