package com.lsf.thread.two.test;

import com.lsf.thread.two.Task;
import com.lsf.thread.two.TaskThreadA;
import com.lsf.thread.two.TaskThreadB;
import org.junit.Test;

/**
 * Created by shengfeng on 2016/10/26.
 */
public class TaskThreadTest {

    @Test
    public void  testTaskThread() {
        Task task = new Task();

        TaskThreadA taskThreadA = new TaskThreadA(task);
        Thread threadA = new Thread(taskThreadA);
        threadA.setName("A");
        threadA.start();

        TaskThreadB taskThreadB = new TaskThreadB(task);
        Thread threadB = new Thread(taskThreadB);
        threadB.setName("B");
        threadB.start();
    }
}
