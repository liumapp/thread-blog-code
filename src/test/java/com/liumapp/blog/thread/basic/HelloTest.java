package com.liumapp.blog.thread.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liumapp
 * @file HelloTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/15/18
 */
@RunWith(SpringRunner.class)
public class HelloTest {

    private Logger logger = LoggerFactory.getLogger(HelloTest.class);

    /**
     * In order to show the randomness of the thread
     */
    @Test
    public void testHello () {
        try {
            HelloThread helloThread = new HelloThread();
            helloThread.setName("hello-thread");
            helloThread.start();
            for (int i = 0 ; i < 10 ; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                logger.info("main = " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
