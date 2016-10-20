package com.lsf.thread.one;

/**
 *
 */
public class Thread_Interrupt_1 extends Thread {

//    public void run() {
//        for (int i = 0; i < 500000; i++) {
//            if(this.interrupted()) {
//                System.out.println("已经是停止状态了，我要退出了");
//                break;
//            }
//            System.out.println("i=" + (i + 1));
//        }
//
//    }
    public  void  run() {
        try {
            System.out.println("RUN GO GO GO ");
            Thread.sleep(200000);
            System.out.println("RUN Stop! ");
        } catch (InterruptedException e) {
            System.out.println("ENTER INTO CATCH");
            e.printStackTrace();
        }
    }

}
