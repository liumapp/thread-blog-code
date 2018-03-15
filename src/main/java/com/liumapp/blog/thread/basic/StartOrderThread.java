package com.liumapp.blog.thread.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liumapp
 * @file StartOrderThread.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/15/18
 */
public class StartOrderThread extends Thread {

    private int i ;

    private static Logger logger = LoggerFactory.getLogger(StartOrderThread.class);

    public StartOrderThread(int i) {
        super();
        this.i = i;
    }

    @Override
    public void run() {
        logger.info(Integer.toString(i));
    }

}
