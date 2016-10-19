package com.lsf.thread.test;

import com.lsf.thread.ThreadSafe_1;
import com.lsf.thread.ThreadSafe_2;
import org.junit.Test;

/**
 * Created by shengfeng on 2016/10/19. 主要测试不共享数据的情况
 */
public class ThreadSafeTest {

    @Test
    public void testThreadSafe_1() {
        ThreadSafe_1 ts1 = new ThreadSafe_1("线程1");
        ThreadSafe_1 ts2 = new ThreadSafe_1("线程2");
        ThreadSafe_1 ts3 = new ThreadSafe_1("线程3");
        ts1.start();
        ts2.start();
        ts3.start();
    }

    @Test
    public void  testThreadSafe_2() {
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


}
