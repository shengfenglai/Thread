package com.lsf.thread.one;

/**
 * Created by shengfeng on 2016/10/19.isAlive()方法用来判断当前线程石否处于活跃状态
 */
public class ThreadSafe_3 extends Thread {

    public void run() {
        System.out.println("RUN :" + this.isAlive());
    }

}
