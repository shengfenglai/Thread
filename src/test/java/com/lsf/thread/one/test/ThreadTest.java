package com.lsf.thread.one.test;

import com.lsf.thread.one.*;
import org.junit.Test;

/**
 * Created by shengfeng on 2016/10/19.
 */
public class ThreadTest {

    @Test
    public void testThreadSafe_1() {
        // 主要测试不共享数据的情况
        ThreadSafe_1 ts1 = new ThreadSafe_1("线程1");
        ThreadSafe_1 ts2 = new ThreadSafe_1("线程2");
        ThreadSafe_1 ts3 = new ThreadSafe_1("线程3");
        ts1.start();
        ts2.start();
        ts3.start();
    }

    @Test
    public void testThreadSafe_2() {
        // 主要测试共享数据的情况
        ThreadSafe_2 ts1 = new ThreadSafe_2("线程1");
        ThreadSafe_2 ts2 = new ThreadSafe_2("线程2");
        ThreadSafe_2 ts3 = new ThreadSafe_2("线程3");
        ThreadSafe_2 ts4 = new ThreadSafe_2("线程4");
        ThreadSafe_2 ts5 = new ThreadSafe_2("线程5");
        ts1.start();
        ts2.start();
        ts3.start();
        ts4.start();
        ts5.start();
    }

    @Test
    public void testGetCurrentThreadMethod() {
        System.out.println(Thread.currentThread().getName());
        // print : main
    }

    @Test
    public void testIsAlive() throws InterruptedException {
        Thread_IsAlive threadSafe_3 = new Thread_IsAlive();
        System.out.println("BEGIN:" + threadSafe_3.isAlive());
        threadSafe_3.start();
        // Thread.sleep(1000);
        System.out.println("END:" + threadSafe_3.isAlive());
        // 没有Thread.sleep(1000);输出：F T T
        // 有Thread.sleep(1000);输出：F T F

    }

    @Test
    public void testSleep() {
        Thread_Sleep t1 = new Thread_Sleep();
        t1.start();
    }

    @Test
    public void testYield() {
        Thread_Yield t2 = new Thread_Yield();
        t2.start();
    }

    @Test
    public void testStartAndRun() {
        Thread_StartAndRun td3 = new Thread_StartAndRun();
        Thread t1 = new Thread(td3, "A");
        Thread t2 = new Thread(td3, "B");

        // 第一种，单纯地测试run()方法,这种情况下，main线程顺序的执行了t1和t2，并打印出main0-main99
        t1.run();
        t2.run();

        System.out.println("------------分割线---------------");
        // 第二种，单纯地测试start()方法，这种情况下，t1和t2线程互不影响，各自创建了一个线程打印出A0-A99和B0-B99
        t1.start();
        t2.start();

        System.out.println("------------分割线---------------");

        // 得出的结论：只有调用了start()方法，才会表现出多线程的特性，不同线程的run()方法里面的代码交替执行。如果只是调用run()方法，那么代码还是同步执行的，必须等待一个线程的run()方法里面的代码全部执行完毕之后，另外一个线程才可以执行其run()方法里面的代码。

    }

    @Test
    public void testGetId() {
        Thread_GetId t4 = new Thread_GetId();
        t4.start();
    }

    @Test
    public  void testThread_Interrupt_1() throws InterruptedException {
        Thread_Interrupt_1 t1 = new Thread_Interrupt_1();
        t1.start();
        Thread.sleep(200);
        t1.interrupt();

    }

    @Test
    public  void testStop() throws InterruptedException {
        Thread_Stop ts = new Thread_Stop();
        Thread t = new Thread(ts,"STOP");
        t.start();
        Thread.sleep(8000);
        t.stop();
        System.out.println(t.interrupted());
    }

    @Test
    public  void testSuspendAndResume() throws InterruptedException {
        Thread_SuspendAndResume tsr = new Thread_SuspendAndResume();
        Thread t = new Thread(tsr);
        t.start();
        t.setDaemon(true);

        Thread.sleep(5000);
        t.suspend();//暂停线程的执行
        System.out.println("A:" + System.currentTimeMillis() + "i=" + tsr.getI());
        Thread.sleep(5000);
        System.out.println("A:" + System.currentTimeMillis() + "i=" + tsr.getI());

        t.resume();
        Thread.sleep(5000);

        System.out.println("B:" + System.currentTimeMillis() + "i=" + tsr.getI());
        Thread.sleep(5000);
        System.out.println("B:" + System.currentTimeMillis() + "i=" + tsr.getI());
    }
}
