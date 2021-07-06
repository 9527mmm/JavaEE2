package com.zxk.homework.test1;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/22/ 20:52
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Test {
    public static void main(String[] args) {
        Door door = new Door();
        door.locked();
        door.clear();
        Door.close(new Lock() {
            @Override
            public void locked() {
                System.out.println("已上锁");
            }

            @Override
            public void clear() {
                System.out.println("已解锁");
            }
        });
    }
}
