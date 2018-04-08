package com.liumapp.blog.thread.basic;

/**
 * @author liumapp
 * @file Daemon.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 */
public class Daemon extends Thread {

    private int i = 0 ;

    @Override
    public void run() {
        try {
            while(true) {
                i++;
                System.out.println("i = " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
