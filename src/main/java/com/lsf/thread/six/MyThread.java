package com.lsf.thread.six;

public class MyThread implements Runnable {

    @Override
    public void run() {
        System.out.println(MyObject.getInstance().hashCode());
    }

}
