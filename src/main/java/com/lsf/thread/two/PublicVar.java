package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/10/25.
 */
public class PublicVar {

    private String username = "AA";
    private String password = "AA";

    synchronized public void setVal(String username, String password) {
        try {
            this.username = username;
            Thread.sleep(2);
            this.password = password;
            System.out.println("thread name:" + Thread.currentThread().getName() + ": set value : " + "username= " + username + "  password= " + password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void getVal() {
        System.out.println("thread name:" + Thread.currentThread().getName() + ": get value : " + "username= " + username + "  password= " + password);
    }
}
