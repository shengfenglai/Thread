package com.lsf.thread;

/**
 * Created by shengfeng on 2016/10/19.
 */
public class ThreadSafe_2 extends Thread {

    private static int count = 5;

    public ThreadSafe_2(String name) {
        super();
        this.setName(name);

    }

    synchronized public void run() {
        count--;
        System.out.println("由" + this.currentThread().getName() + "得到的count=" + count);
    }
}
