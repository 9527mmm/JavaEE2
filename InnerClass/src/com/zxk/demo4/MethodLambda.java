package com.zxk.demo4;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/10/ 17:42
 * @Description:
 **/
public class MethodLambda {
    public static void main(String[] args) {
        userShowHandler(new ShowHandler() {
            @Override
            public void show() {
                System.out.println("匿名内部类中的");
            }
        });

        userShowHandler(() -> {
            System.out.println("lambda中的");
        });

    }

    public static void userShowHandler(ShowHandler showHandler) {
        showHandler.show();
    }
}

interface ShowHandler {
    void show();
}
