package com.lsf.thread.six;

public class MyObject {

    private static MyObject myObject = new MyObject();

    private MyObject() {
    }

    public static MyObject getInstance() {
        return myObject;
    }
}
