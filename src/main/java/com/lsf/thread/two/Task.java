package com.lsf.thread.two;

/**
 * Created by shengfeng on 2016/10/26.
 */
public class Task {
    private String dataA;
    private String dataB;

    public void doLongTimeTask() {
        try {
            System.out.println("task begin!!!");
            Thread.sleep(1);

            String privateDataA = "thread name = " + Thread.currentThread().getName();
            String privateDataB = "thread name = " + Thread.currentThread().getName();

            synchronized (this) {
                dataA = privateDataA;
                dataB = privateDataB;
            }

            System.out.println(dataA);
            System.out.println(dataB);
            System.out.println("task end !!!!!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
