package com.liumapp.blog.thread.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liumapp
 * @file HelloThread.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/15/18
 */
public class HelloThread extends Thread {

    private static Logger logger = LoggerFactory.getLogger(HelloThread.class);

    @Override
    public void run() {
        try {
            for (int i = 0 ; i < 10 ; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                logger.info("run = " + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
