package com.lsf.thread.two.test;

import com.lsf.thread.two.StringService;
import com.lsf.thread.two.StringServiceThreadA;
import com.lsf.thread.two.StringServiceThreadB;
import org.junit.Test;

/**
 * Created by shengfeng on 2016/12/22.
 */
public class StringServiceThreadTest {

    @Test
    public void testServiceThread() {
        StringService stringService = new StringService();

        StringServiceThreadA stringServiceThreadA = new StringServiceThreadA(stringService);
        Thread threadA = new Thread(stringServiceThreadA);
        threadA.setName("A");
        threadA.start();

        StringServiceThreadB stringServiceThreadB = new StringServiceThreadB(stringService);
        Thread threadB = new Thread(stringServiceThreadB);
        threadB.setName("B");
        threadB.start();
    }
}
