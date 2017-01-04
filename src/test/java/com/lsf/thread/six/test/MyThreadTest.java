package com.lsf.thread.six.test;

import org.junit.Test;

import com.lsf.thread.six.MyThread;

public class MyThreadTest {

    @Test
    public void test() {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();

        Thread thread1 = new Thread(myThread1);
        Thread thread2 = new Thread(myThread2);
        Thread thread3 = new Thread(myThread3);

        thread1.start();
        thread2.start();
        thread3.start();
    }

}
