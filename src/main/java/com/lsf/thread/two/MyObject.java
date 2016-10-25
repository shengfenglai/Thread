package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/10/25.
 */
public class MyObject {

    synchronized public void print() {

        try {
            System.out.println("begin print ,threadName=" + Thread.currentThread().getName());
            Thread.sleep(2);
            System.out.println("end endTime" + System.currentTimeMillis());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized public void write() {
        try {
            System.out.println("begin write ,threadName=" + Thread.currentThread().getName() + " begin time" + System.currentTimeMillis());
            Thread.sleep(1);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
