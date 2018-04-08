package com.liumapp.blog.thread.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author liumapp
 * @file DaemonTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 */
@RunWith(SpringRunner.class)
public class DaemonTest {

    @Test
    public void testDaemon () {
        try {
            Daemon daemon = new Daemon();
            daemon.setDaemon(true);
            daemon.start();
            daemon.sleep(5000);
            System.out.println("main thread out , and daemon thread will out ");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
