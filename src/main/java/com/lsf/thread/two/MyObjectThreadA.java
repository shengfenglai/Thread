package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/10/25.
 */
public class MyObjectThreadA implements Runnable {

    private MyObject myObject;

    public MyObjectThreadA(MyObject myObject) {
        this.myObject = myObject;
    }

    public void run() {
        myObject.print();
    }
}
