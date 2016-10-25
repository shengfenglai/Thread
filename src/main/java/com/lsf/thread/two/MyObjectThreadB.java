package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/10/25.
 */
public class MyObjectThreadB implements Runnable {

    private MyObject myObject;

    public MyObjectThreadB(MyObject myObject) {
        this.myObject = myObject;
    }

    public void run() {
        myObject.write();
    }
}
