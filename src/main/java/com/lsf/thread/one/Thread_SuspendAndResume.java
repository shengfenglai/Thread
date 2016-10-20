package com.lsf.thread.one;

/**
 * Created by shengfeng on 2016/10/20.
 */
public class Thread_SuspendAndResume implements Runnable {

    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void run() {
        while (true) {
            i++;
        }
    }
}
