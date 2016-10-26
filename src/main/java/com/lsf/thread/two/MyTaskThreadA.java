package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/10/26.
 */
public class MyTaskThreadA implements Runnable {
    private MyTask myTask;

    public MyTaskThreadA(MyTask myTask) {
        this.myTask = myTask;
    }

    public void run() {
        myTask.doLongTimeTask();
    }
}
