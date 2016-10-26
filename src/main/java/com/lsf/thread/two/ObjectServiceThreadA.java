package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/10/26.
 */
public class ObjectServiceThreadA implements Runnable {

    private ObjectService objectService;

    public ObjectServiceThreadA(ObjectService objectService) {
        this.objectService = objectService;
    }

    public void run() {
        objectService.serviceMethod();
    }
}
