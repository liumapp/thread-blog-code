package com.liumapp.blog.thread.basic;

import com.liumapp.blog.thread.CurrentThread;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liumapp
 * @file CurrentThreadTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 */
@RunWith(SpringRunner.class)
public class CurrentThreadTest {

    @Test
    public void testCurrent () {
        try {
            CurrentThread currentThread = new CurrentThread();
            currentThread.start();
            currentThread.sleep(10000);//sleep main thread
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
