package com.zxk.homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(".\\ioStream\\sort.txt", true);
        for (int i = 1; ; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入第" + i + "名学生姓名和年龄（ok）表示结束");
            String a = sc.next();

            if (a.equals("ok")) {
                break;
            }
            fos.write(a.getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();

    }
}
