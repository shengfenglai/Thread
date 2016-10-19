package com.lsf.thread.one.test;

import org.junit.Test;

import com.lsf.thread.one.*;

/**
 * Created by shengfeng on 2016/10/19.
 */
public class ThreadTest {

    @Test
    public void testThreadSafe_1() {
        //主要测试不共享数据的情况
        ThreadSafe_1 ts1 = new ThreadSafe_1("线程1");
        ThreadSafe_1 ts2 = new ThreadSafe_1("线程2");
        ThreadSafe_1 ts3 = new ThreadSafe_1("线程3");
        ts1.start();
        ts2.start();
        ts3.start();
    }

    @Test
    public void  testThreadSafe_2() {
        //主要测试共享数据的情况
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
        // print :  main
    }

    @Test
    public void testIsAlive() throws InterruptedException {
        ThreadSafe_3 threadSafe_3 = new ThreadSafe_3();
        System.out.println("BEGIN:" + threadSafe_3.isAlive());
        threadSafe_3.start();
        //Thread.sleep(1000);
        System.out.println("END:" + threadSafe_3.isAlive());
        // 没有Thread.sleep(1000);输出：F T T
        // 有Thread.sleep(1000);输出：F T F

    }

    @Test
    public  void testSleep(){
        Thread_1 t1 = new Thread_1();
        t1.start();
    }

    @Test
    public void testYield() {
        Thread_2 t2 = new Thread_2();
        t2.start();
    }

}
