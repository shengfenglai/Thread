package com.lsf.thread.two.test;

import com.lsf.thread.two.MyTask;
import com.lsf.thread.two.MyTaskThreadA;
import com.lsf.thread.two.MyTaskThreadB;
import org.junit.Test;

/**
 * Created by shengfeng on 2016/10/26.
 */
public class MyTaskThreadTest {

    @Test
    public void testTaskThread() {
        MyTask myTask = new MyTask();

        MyTaskThreadA myTaskThreadA = new MyTaskThreadA(myTask);
        Thread threadA = new Thread(myTaskThreadA);
        threadA.setName("A");
        threadA.start();

        MyTaskThreadB myTaskThreadB = new MyTaskThreadB(myTask);
        Thread threadB = new Thread(myTaskThreadB);
        threadB.setName("B");
        threadB.start();
    }
}
