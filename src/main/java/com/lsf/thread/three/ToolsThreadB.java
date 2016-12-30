package com.lsf.thread.three;

public class ToolsThreadB implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Tools.threadLocal.set("threadB :" + i);
                System.out.println("threadB get val:" + Tools.threadLocal.get());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
