package com.liumapp.blog.thread.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liumapp
 * @file Hello.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/15/18
 */
public class Hello extends Thread {

    private static Logger logger = LoggerFactory.getLogger(Hello.class);

    @Override
    public void run() {
        super.run();
        logger.info("Hello world");
    }
}
