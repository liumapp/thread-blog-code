package com.liumapp.blog.thread.basic.runnable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liumapp
 * @file HelloRunnable.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/15/18
 */
public class HelloRunnable implements Runnable {

    private static Logger logger = LoggerFactory.getLogger(HelloRunnable.class);

    @Override
    public void run() {
        logger.info("under running !");
    }
}
