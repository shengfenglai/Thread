package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/10/26.
 */
public class ObjectService {

    public void serviceMethod() {
        try {
            synchronized (this) {
                System.out.println("begin time = " + System.currentTimeMillis() + " , thread name: " + Thread.currentThread().getName());
                Thread.sleep(1);
                System.out.println("end time = " + System.currentTimeMillis() + " , thread name: " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}