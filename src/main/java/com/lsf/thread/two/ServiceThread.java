package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/10/26.
 */
public class ServiceThread implements Runnable {

    private Service service;

    public ServiceThread(Service service) {
        this.service = service;
    }

    public void run() {
        service.service1();
    }
}
