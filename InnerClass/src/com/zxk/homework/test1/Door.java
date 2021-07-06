package com.zxk.homework.test1;

/**
 * @Author: zhaoxuekai
 * @Date: 2021/06/22/ 20:48
 * @Description: TODO
 * @GitHup: 957kk
 */
public class Door implements Lock {
    @Override
    public void locked() {
        System.out.println("已上锁");
    }

    @Override
    public void clear() {
        System.out.println("已解锁");

    }

    public static void open(Lock lock) {
        lock.clear();
        System.out.println("开门");
    }

    public static void close(Lock lock) {
        lock.locked();
        System.out.println("关门");
    }
}
