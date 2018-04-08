package com.liumapp.blog.thread.concurrent.unsafe.demo1;

/**
 * @author liumapp
 * @file ThreadB.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 */
public class ThreadB extends Thread {

    private HasSelfPrivateNum numRef;

    public ThreadB(HasSelfPrivateNum numRef) {
        this.numRef = numRef;
    }

    @Override
    public void run() {
        super.run();
        numRef.add("b");
    }
}
