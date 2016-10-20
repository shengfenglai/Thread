package com.lsf.thread.one;

/**
 * Created by shengfeng on 2016/10/19
 * 测试getId这个方法
 */
public class Thread_GetId extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " 's id is :" + Thread.currentThread().getId());
    }

}
