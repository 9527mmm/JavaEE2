package com.zxk.demo5;


/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/22/ 14:39
 * @Description: lambda
 * @GitHup: 957kk
 */


public class ShowHandlerTest {
    public static void main(String[] args) {
        ShowHandlerTest showHandlerTest = new ShowHandlerTest();
        showHandlerTest.userShowHandler(new ShowHandler() {
            @Override
            public void show(String msg,int age) {
                System.out.println(msg + "nihao ");
            }


        });

        showHandlerTest.userShowHandler((msg, age) -> System.out.println(msg + "lambda"));


    }

    public void userShowHandler(ShowHandler showHandler) {
        showHandler.show("aaa", 13);
    }
}

interface ShowHandler {
    void show(String msg, int age);
}
