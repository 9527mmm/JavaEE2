package com.zxk.homework;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;

public class Test1 {
    public static void main(String[] args) throws IOException {

        File file1 = new File("D:\\test1.txt");
        boolean newFile = file1.createNewFile();
        File file2 = new File("D:\\测试目录");
        boolean mkdirs = file2.mkdirs();
        System.out.println("file1的绝对路径"+file1.getAbsoluteFile());
        System.out.println("file2的绝对路径"+file2.getAbsoluteFile());

        System.out.println("file1的文件名"+file1.getName());
        System.out.println("file2的文件名"+file2.getName());

        System.out.println("file1的大小是"+file1.length());
        System.out.println("file1的大小是"+file2.length());

        System.out.println("file1是文件吗"+file1.isFile());
        System.out.println("file1是文件夹吗"+file1.isDirectory());

        System.out.println("file2是文件吗"+file2.isFile());
        System.out.println("file2是文件夹吗"+file2.isDirectory());


    }
}
