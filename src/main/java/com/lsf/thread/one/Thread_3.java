package com.lsf.thread.one;

/**
 * Created by shengfeng on 2016/10/19 用来比较start() 方法和run()方法的区别，会在单元测试里的代码中比较出结果
 */
public class Thread_3 extends Thread {

	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}

	}

}
