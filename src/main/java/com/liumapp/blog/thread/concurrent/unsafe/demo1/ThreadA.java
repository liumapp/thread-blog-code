package com.liumapp.blog.thread.concurrent.unsafe.demo1;

/**
 * @author liumapp
 * @file ThreadA.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 */
public class ThreadA extends Thread {

    private HasSelfPrivateNum numRef;

    public ThreadA(HasSelfPrivateNum numRef) {
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.add("a");
    }
}
