package com.zxk.test;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {

       /* FileInputStream fis = new FileInputStream( "F:\\KwDownload\\song\\Eminem-Rap God.flac");
        FileOutputStream fos = new FileOutputStream("F:\\Eminem-Rap God.flac");
        int read;
        while ((read = fis.read()) != -1){
            fos.write(read);
        }
        fis.close();
        fos.close();*/
       /* FileInputStream fis = new FileInputStream("D:\\迅雷下载\\22000.51.210617-2050.CO_RELEASE_SVC_PROD2_CLIENTMULTICOMBINED_UUP_X64FRE_ZH-CN.ISO");
        FileOutputStream fos = new FileOutputStream("F:\\22000.51.210617-2050.CO_RELEASE_SVC_PROD2_CLIENTMULTICOMBINED_UUP_X64FRE_ZH-CN.ISO");
        long start = System.currentTimeMillis();
        byte[] bytes = new byte[102400];
        int len;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        fis.close();
        fos.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);*/

        FileInputStream fis = new FileInputStream("D:\\迅雷下载\\22000.51.210617-2050.CO_RELEASE_SVC_PROD2_CLIENTMULTICOMBINED_UUP_X64FRE_ZH-CN.ISO");
        FileOutputStream fos = new FileOutputStream("F:\\22000.51.210617-2050.CO_RELEASE_SVC_PROD2_CLIENTMULTICOMBINED_UUP_X64FRE_ZH-CN.ISO");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        long start = System.currentTimeMillis();
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bos.close();
        bis.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }

}

