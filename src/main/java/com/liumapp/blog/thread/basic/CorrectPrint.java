package com.liumapp.blog.thread.basic;

/**
 * @author liumapp
 * @file CorrectPrint.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/24/18
 */
public class CorrectPrint extends Thread {

    private int i = 5;

    @Override
    synchronized public void run() {
        System.out.println(" i = " + (i--) + " threadname = " + Thread.currentThread().getName());
    }
}
