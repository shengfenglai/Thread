package com.lsf.thread.two.test;

import com.lsf.thread.two.HasSafePrivateNum;
import com.lsf.thread.two.HasSafePrivateNumThreadA;
import com.lsf.thread.two.HasSafePrivateNumThreadB;
import org.junit.Test;

/**
 * Created by shengfeng on 2016/10/25.
 */
public class HasSafePrivateNumThreadTest_1 {

    @Test
    public void testHasSafePrivateNumThread() {
        HasSafePrivateNum hspn1 = new HasSafePrivateNum();
        HasSafePrivateNum hspn2 = new HasSafePrivateNum();

        HasSafePrivateNumThreadA threadA = new HasSafePrivateNumThreadA(hspn1);
        Thread a = new Thread(threadA);
        a.start();


        HasSafePrivateNumThreadB threadB = new HasSafePrivateNumThreadB(hspn2);
        Thread b = new Thread(threadB);
        b.start();


    }

}
