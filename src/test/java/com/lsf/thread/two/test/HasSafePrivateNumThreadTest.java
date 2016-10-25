package com.lsf.thread.two.test;

import com.lsf.thread.two.HasSafePrivateNum;
import com.lsf.thread.two.HasSafePrivateNumThreadA;
import com.lsf.thread.two.HasSafePrivateNumThreadB;
import org.junit.Test;

/**
 * Created by shengfeng on 2016/10/25.
 */
public class HasSafePrivateNumThreadTest {

    @Test
    public void testHasSafePrivateNumThread() {
        HasSafePrivateNum hspn = new HasSafePrivateNum();

        HasSafePrivateNumThreadA threadA = new HasSafePrivateNumThreadA(hspn);
        Thread a = new Thread(threadA);
        a.start();


        HasSafePrivateNumThreadB threadB = new HasSafePrivateNumThreadB(hspn);
        Thread b = new Thread(threadB);
        b.start();


    }

}
