package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/10/26.
 */
public class TaskThreadB implements Runnable {
    private Task task;

    public TaskThreadB(Task task) {
        this.task = task;
    }

    public void run() {
        task.doLongTimeTask();
    }
}
