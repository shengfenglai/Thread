package com.lsf.thread.one;

/**
 * Created by shengfeng on 2016/10/19
 * yield() 作用是放弃当前的CPU资源，将它让给其他的任务去占用CPU执行时间，但放弃的时间又不定，有可能刚刚放弃，也有可能刚放弃马上又获得CPU时间片
 */
public class Thread_Yield extends Thread {

    public void run() {
        long startTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 0;i< 50000000;i++) {
            //Thread.yield();
            count = count + (i+1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时：" + (endTime - startTime) + "ms");


    }

}
