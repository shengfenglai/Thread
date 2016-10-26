package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/10/26.
 */
public class MyTaskThreadB implements Runnable {
    private MyTask myTask;

    public MyTaskThreadB(MyTask myTask) {
        this.myTask = myTask;
    }

    public void run() {
        myTask.doLongTimeTask();
    }
}
