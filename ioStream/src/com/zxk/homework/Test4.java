package com.zxk.homework;

import java.io.File;

public class Test4 {
    public static void main(String[] args) {

        File file = new File("D:\\多级目录");

        Test4 test4 = new Test4();
        System.out.println(test4.method(file));
    }
    int count=0;
    private int method(File file) {
        File[] files = file.listFiles();
        for (File file1 : files) {
            if(file1.isFile()){
                count+=file1.length();
            }else {
                method(file1);
            }
        }
        return count;
    }

}
