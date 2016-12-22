package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/12/22.
 */
public class StringService {
    public static void print(String stringName) {
        try {
            synchronized (stringName) {
                while (true) {
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(2);
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
