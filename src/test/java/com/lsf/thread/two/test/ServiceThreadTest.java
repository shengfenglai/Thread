package com.lsf.thread.two.test;

import com.lsf.thread.two.Service;
import com.lsf.thread.two.ServiceThread;
import org.junit.Test;

/**
 * Created by shengfeng on 2016/10/26.
 */
public class ServiceThreadTest {

    @Test
    public void testServiceThread() {
        Service service = new Service();
        ServiceThread serviceThread = new ServiceThread(service);
        Thread thread = new Thread(serviceThread);
        thread.start();
    }
}
