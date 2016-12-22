package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/12/22.
 */
public class StringServiceThreadB implements Runnable {

    private StringService stringService;

    public StringServiceThreadB(StringService stringService) {
        this.stringService = stringService;
    }

    public void run() {
        stringService.print("AA");
    }

}
