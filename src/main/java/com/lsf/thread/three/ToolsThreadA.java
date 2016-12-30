package com.lsf.thread.three;

public class ToolsThreadA implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Tools.threadLocal.set("threadA :" + i);
                System.out.println("threadA get val:" + Tools.threadLocal.get());
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
