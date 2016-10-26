package com.lsf.thread.two.test;

import com.lsf.thread.two.ObjectService;
import com.lsf.thread.two.ObjectServiceThreadA;
import com.lsf.thread.two.ObjectServiceThreadB;
import org.junit.Test;

/**
 * Created by shengfeng on 2016/10/26.
 */
public class ObjectServiceThreadTest {

    @Test
    public void testObjectService() {
        ObjectService objectService = new ObjectService();

        ObjectServiceThreadA objectServiceThreadA = new ObjectServiceThreadA(objectService);
        Thread threadA = new Thread(objectServiceThreadA);
        threadA.setName("A");
        threadA.start();

        ObjectServiceThreadB objectServiceThreadB = new ObjectServiceThreadB(objectService);
        Thread threadB = new Thread(objectServiceThreadB);
        threadB.setName("B");
        threadB.start();
    }
}
