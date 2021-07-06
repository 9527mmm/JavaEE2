package com.zxk.homework;

import java.io.File;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:/多级目录");
        file1.mkdirs();
        File file2 = new File("D:/多级目录/目录a/目录b");
        file2.mkdirs();
        File file3 = new File("D:/多级目录/目录a/test1.txt");
        file3.createNewFile();
        File file4 = new File("D:/多级目录/目录a/test2.txt");
        file4.createNewFile();
        File file5 = new File("D:/多级目录/目录c/目录b");
        file5.mkdirs();

        method(file1);

    }
    private static void method(File file1) {
        File[] files = file1.listFiles();
        for (File file : files) {
            if(file.isFile()){
                System.out.println("文件"+file.getAbsoluteFile());
            }else {
                method(file);//递归
                System.out.println("文件夹"+file);
            }
        }
    }
}
