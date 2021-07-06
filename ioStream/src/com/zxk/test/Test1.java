package com.zxk.test;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Administrator\\Desktop\\11");
        getDelete(file);
    }

    public static void getDelete(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()) {
                file1.delete();
            } else {
                getDelete(file1);
            }
        }
        file.delete();

    }
}
