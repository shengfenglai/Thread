package com.lsf.thread;

/**
 * Created by shengfeng on 2016/10/19
 * sleep()方法的作用是在指定的毫秒数内让“正在执行的线程”休眠，
 * 这个“正在执行的线程”指的是this.currentThread()返回的线程
 */
public class Thread_1 extends Thread {

    public void run() {
        try {
            System.out.println("RUN :" + this.currentThread().getName() + "BEGIN");
            Thread.sleep(2000);
            System.out.println("RUN :" + this.currentThread().getName() + "END");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
