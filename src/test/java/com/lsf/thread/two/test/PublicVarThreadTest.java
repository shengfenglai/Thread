package com.lsf.thread.two.test;

import com.lsf.thread.two.PublicVar;
import com.lsf.thread.two.PublicVarThreadA;
import org.junit.Test;

/**
 * Created by shengfeng on 2016/10/25.
 */
public class PublicVarThreadTest {

    @Test
    public void testPublicVar() throws InterruptedException {
        PublicVar pv = new PublicVar();

        PublicVarThreadA pta = new PublicVarThreadA(pv);
        Thread threadA = new Thread(pta);
        threadA.start();

        Thread.sleep(2);

        pv.getVal();

    }
}
