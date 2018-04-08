package com.liumapp.blog.thread;

/**
 * @author liumapp
 * @file CurrentThread.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 */
public class CurrentThread extends Thread {

    public CurrentThread() {

        System.out.println("currentthread in constructor is : " + CurrentThread.currentThread().getName());

    }

    @Override
    public void run() {
        System.out.println("currentthread in run is : " + CurrentThread.currentThread().getName());
        for (int i = 0 ; i < 500000 ; i++ ) {
            System.out.println("i = " + i);
        }
        super.run();
    }
}
