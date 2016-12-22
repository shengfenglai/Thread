package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/12/22.
 */
public class StringServiceThreadA implements Runnable {

    private StringService stringService;

    public StringServiceThreadA(StringService stringService) {
        this.stringService = stringService;
    }

    public void run() {
        stringService.print("AA");
    }
}
