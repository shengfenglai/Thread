package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/10/25.
 */
public class PublicVarThreadA implements Runnable {

    private PublicVar publicVar;

    public PublicVarThreadA(PublicVar publicVar) {
        this.publicVar = publicVar;
    }

    public void run() {
        publicVar.setVal("BB", "BB");
    }

}
