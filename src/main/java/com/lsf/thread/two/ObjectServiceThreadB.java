package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/10/26.
 */
public class ObjectServiceThreadB implements Runnable {

    private ObjectService objectService;

    public ObjectServiceThreadB(ObjectService objectService) {
        this.objectService = objectService;
    }

    public void run() {
        objectService.serviceMethodB();
    }

}
