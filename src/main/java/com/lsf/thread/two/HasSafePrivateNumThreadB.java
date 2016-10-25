package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/10/25.
 */
public class HasSafePrivateNumThreadB implements Runnable {

    private HasSafePrivateNum hspn ;

    public HasSafePrivateNumThreadB(HasSafePrivateNum hspn) {
        this.hspn = hspn;
    }

    public void run() {
        hspn.addI("b");
    }
}
