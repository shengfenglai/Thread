package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/10/26.
 */
public class MyTask {

    public void doLongTimeTask() {
        for (int i = 0; i < 20; i++) {
            System.out.println("nosynchronized  thread name = " + Thread.currentThread().getName() + "  i= " + (i + 1));
        }

        System.out.println(" -----------   ");
        synchronized (this) {
            for (int i = 0; i < 50; i++) {
                System.out.println("synchronized  thread name = " + Thread.currentThread().getName() + "  i= " + (i + 1));
            }
        }
    }
}
