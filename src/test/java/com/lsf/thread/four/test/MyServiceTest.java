package com.lsf.thread.four.test;

import org.junit.Test;

import com.lsf.thread.four.MyService;
import com.lsf.thread.four.MyServiceThread;

/**
 * Created by shengfeng on 2017/01/04.
 */
public class MyServiceTest {

    @Test
    public void testMyService() {
        MyService myService = new MyService();

        MyServiceThread myServiceThread1 = new MyServiceThread(myService);
        MyServiceThread myServiceThread2 = new MyServiceThread(myService);
        MyServiceThread myServiceThread3 = new MyServiceThread(myService);
        MyServiceThread myServiceThread4 = new MyServiceThread(myService);
        MyServiceThread myServiceThread5 = new MyServiceThread(myService);

        Thread thread1 = new Thread(myServiceThread1);
        Thread thread2 = new Thread(myServiceThread2);
        Thread thread3 = new Thread(myServiceThread3);
        Thread thread4 = new Thread(myServiceThread4);
        Thread thread5 = new Thread(myServiceThread5);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }

}
