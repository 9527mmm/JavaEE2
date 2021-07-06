package com.zxk.homework.Test7;

import java.io.*;
import java.util.Scanner;

public class Test7 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(".\\ioStream\\text1.txt", true);
        System.out.println("注册");
        register(fos);
        System.out.println("登录");
        logIn();

    }

    private static void logIn() throws IOException {
        File file = new File(".\\ioStream\\text1.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[(int) file.length()];
        fis.read(bytes);
        String s = new String(bytes, "UTF-8");
        System.out.println("请输入用户名");
        String user = sc.next();
        String[] split = s.split("\r\n");
        fis.close();
        for (int i = 0; i < split.length; i++) {
            System.out.println("------" + split[i]);
            String[] split1 = split[i].split(",");
            System.out.println(split1[0]);
            if (user.equals(split1[0])) {
                System.out.println("请输入密码");
                String password = sc.next();
                if (split[i].equals(user + "," + password)) {
                    System.out.println("登陆成功");
                    System.out.println("输入1删除账户,输入其它进行修改账户");
                    String select = sc.next();
                    String base = split[i];
                    FileOutputStream fos = new FileOutputStream(".\\ioStream\\text2.txt");
                    if (select.equals("1")) {
                        delete(split, base, fos);
                    } else {
                        update(split, base, fos);
                    }
                }
            }
        }
    }

    private static void delete(String[] split, String base, FileOutputStream fos) throws IOException {
        for (int i = 0; i < split.length; i++) {
            if (!split[i].equals(base)) {
                fos.write(split[i].getBytes());
                fos.write("\r\n".getBytes());
            }
        }
        fos.close();
    }

    private static void update(String[] split, String base, FileOutputStream fos) throws IOException {
        System.out.println("请输入旧密码");
        String password = sc.next();
        String base2 = base;
        String[] pass = base.split(",");
        if (pass[1].equals(password)) {
            System.out.println("请输入新密码");
            String newpass = sc.next();
            base2 = pass[0] + "," + newpass;
            for (int i = 0; i < split.length; i++) {
                if (split[i].equals(base)) {
                    split[i] = base2;
                }
                fos.write(split[i].getBytes());
                fos.write("\r\n".getBytes());
            }
        }
        fos.close();
    }

    private static void register(FileOutputStream fos) throws IOException {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请入姓名,ok结束");
            String name = sc.next();
            if (name.equals("ok")) {
                fos.close();
                break;
            }
            fos.write(name.getBytes());
            fos.write(",".getBytes());
            getPassword(fos);
            fos.write("\r\n".getBytes());
        }
    }

    private static void getPassword(FileOutputStream fos) throws IOException {
        String password1;
        String password2;
        while (true) {
            System.out.println("请输入登录密码");
            password1 = sc.next();
            System.out.println("确认密码");
            password2 = sc.next();
            if (!password1.equals(password2)) {
                continue;
            }
            break;
        }
        fos.write(password1.getBytes());
    }
}
