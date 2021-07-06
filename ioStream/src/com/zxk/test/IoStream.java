package com.zxk.test;

import java.io.*;

public class IoStream {
    public static void main(String[] args) throws IOException {

       /* FileOutputStream fso = new FileOutputStream("C:\\Users\\Administrator\\Desktop\\a.txt", true);
        fso.write("helloworld".getBytes(), 1, 4);
        fso.write("\r\n".getBytes());
        fso.write(90);
        fso.write("\r\n".getBytes());
        fso.write(90);
        //fso.flush();
        fso.close();*/
       /* FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\a.txt");
        int read;
        while ((read = fis.read()) != -1) {
            //int read = fis.read();
            System.out.print((char) read);
        }*/
        File file = new File("C:\\Users\\Administrator\\Desktop\\Eminem-Rap God.flac");
        file.delete();

        // fis.close();
    }
}
