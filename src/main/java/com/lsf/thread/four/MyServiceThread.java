package com.lsf.thread.four;

public class MyServiceThread implements Runnable {

    private MyService myService;

    public MyServiceThread(MyService myService) {
        this.myService = myService;
    }

    @Override
    public void run() {
        myService.testMethod();
    }

}
