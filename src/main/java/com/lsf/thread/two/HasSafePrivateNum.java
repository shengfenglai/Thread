package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/10/25.
 */
public class HasSafePrivateNum {

    private int num = 0;

    public void addI(String userName) {
        try {
            if ("a".equals(userName)) {
                num = 100;
                System.out.println("a set over!");
                Thread.sleep(2000);
            } else {
                num = 200;
                System.out.println("b set over!");
            }
            System.out.println(userName + " num = " + num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
