package com.lsf.thread.one;

/**
 * Created by shengfeng on 2016/10/20.
 */
public class Thread_Stop implements  Runnable{

    private  int i =0;
    public void run() {
        while (true){
            i++;
            System.out.println("i=" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
