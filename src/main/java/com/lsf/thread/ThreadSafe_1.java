package com.lsf.thread;

/**
 * Created by shengfeng on 2016/10/19.
 */
public class ThreadSafe_1 extends Thread {

    private  int count = 5;

    public ThreadSafe_1(String name) {
        super();
        this.setName(name);

    }

    public void run() {
        while (count > 0) {
            count--;
            System.out.println("由" + this.currentThread().getName() + "得到的count=" + count);
        }
    }
}
