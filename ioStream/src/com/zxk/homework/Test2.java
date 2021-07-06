package com.zxk.homework;

import java.io.File;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("test.txt");
        File file2 = new File("一级目录");
        File file3 = new File("目录A/目录B/目录C");
        if(!file1.exists()){
            file1.createNewFile();
        }
        if(!file2.exists()){
            file2.mkdirs();
        }
        if(!file3.exists()){
            file3.mkdirs();
        }

    }
}
