package com.lsf.thread.three;

public class WaitTest {

    public static void main(String[] args) {
        try {
            // 这样使用会直接抛异常，出现异常的原因是没有对象监视器，也就是没有同步加锁
            // String lock = new String();
            // lock.wait();

            // 锁住对象，这样就使之停止运行了，所以要让程序继续往下走的话，需要notify它
            String lock = new String();
            System.out.println("sync up");
            synchronized (lock) {
                System.out.println("before wait");
                lock.wait();
                System.out.println("after wait");
            }
            System.out.println("sync down");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
