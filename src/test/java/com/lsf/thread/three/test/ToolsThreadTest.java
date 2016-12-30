package com.lsf.thread.three.test;

import org.junit.Test;

import com.lsf.thread.three.Tools;
import com.lsf.thread.three.ToolsThreadA;
import com.lsf.thread.three.ToolsThreadB;

/**
 * Created by shengfeng on 2016/12/30.
 */
public class ToolsThreadTest {

    @Test
    public void testTaskThread() throws InterruptedException {

        ToolsThreadA toolsThreadA = new ToolsThreadA();
        ToolsThreadB toolsThreadB = new ToolsThreadB();
        Thread threadA = new Thread(toolsThreadA);
        Thread threadB = new Thread(toolsThreadB);
        threadA.start();
        threadB.start();

        for (int i = 0; i < 100; i++) {
            Tools.threadLocal.set("Test set val :" + i);
            System.out.println("Test get val" + Tools.threadLocal.get());
            Thread.sleep(2000);
        }
    }
}
