package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/12/22.
 */
public class StringServiceThreadA implements Runnable {

    private StringService stringService;

    public StringServiceThreadA(StringService stringService) {
        this.stringService = stringService;
    }

    @SuppressWarnings("static-access")
    public void run() {
        stringService.print("AA");
    }
}
