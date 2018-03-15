package com.liumapp.blog.thread.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liumapp
 * @file StartOrderThreadTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/15/18
 */
@RunWith(SpringRunner.class)
public class StartOrderThreadTest {

    private static Logger logger = LoggerFactory.getLogger(StartOrderThreadTest.class);

    /**
     * The order of thread execution does not represent the order of thread startup
     */
    @Test
    public void test () {
        StartOrderThread sot1 = new StartOrderThread(1);
        StartOrderThread sot2 = new StartOrderThread(2);
        StartOrderThread sot3 = new StartOrderThread(3);
        StartOrderThread sot4 = new StartOrderThread(4);
        StartOrderThread sot5 = new StartOrderThread(5);
        StartOrderThread sot6 = new StartOrderThread(6);
        StartOrderThread sot7 = new StartOrderThread(7);
        StartOrderThread sot8 = new StartOrderThread(8);
        StartOrderThread sot9 = new StartOrderThread(9);
        StartOrderThread sot10 = new StartOrderThread(10);

        sot1.start();
        sot2.start();
        sot3.start();
        sot4.start();
        sot5.start();
        sot6.start();
        sot7.start();
        sot8.start();
        sot9.start();
        sot10.start();
    }

}
