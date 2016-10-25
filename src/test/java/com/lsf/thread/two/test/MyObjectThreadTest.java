package com.lsf.thread.two.test;

import com.lsf.thread.two.MyObject;
import com.lsf.thread.two.MyObjectThreadA;
import com.lsf.thread.two.MyObjectThreadB;
import org.junit.Test;

/**
 * Created by shengfeng on 2016/10/25.
 */
public class MyObjectThreadTest {

    @Test
    public void testMyObjectThread() {
        MyObject myObject = new MyObject();

        MyObjectThreadA threadA = new MyObjectThreadA(myObject);
        Thread a = new Thread(threadA);
        a.setName("A");
        a.start();

        MyObjectThreadB threadB = new MyObjectThreadB(myObject);
        Thread b = new Thread(threadB);
        b.setName("B");
        b.start();

    }
}
