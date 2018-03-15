package com.liumapp.blog.thread.basic.runnable;

import com.liumapp.blog.thread.basic.HelloThread;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liumapp
 * @file HelloRunnableTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/15/18
 */
@RunWith(SpringRunner.class)
public class HelloRunnableTest {

    private Logger logger = LoggerFactory.getLogger(HelloRunnableTest.class);

    /**
     * Java is single inheritance , not supporting multiple inheritance
     * We use Runnable to solve multy thread .
     * By the way , Thread itself is also implemented Runnable
     */
    @Test
    public void test () {
        HelloRunnable helloRunnable = new HelloRunnable();
        Thread thread = new Thread(helloRunnable);
        thread.start();
        logger.info("job is done !");
    }

}
