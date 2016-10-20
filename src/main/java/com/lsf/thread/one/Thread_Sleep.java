package com.lsf.thread.one;

/**
 * Created by shengfeng on 2016/10/19
 * sleep()方法的作用是在指定的毫秒数内让“正在执行的线程”休眠，
 * 这个“正在执行的线程”指的是this.currentThread()返回的线程
 */
public class Thread_Sleep extends Thread {

    public void run() {
        try {
            System.out.println("RUN :" + Thread.currentThread().getName() + "BEGIN");
            Thread.sleep(2000);
            System.out.println("RUN :" + Thread.currentThread().getName() + "END");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
