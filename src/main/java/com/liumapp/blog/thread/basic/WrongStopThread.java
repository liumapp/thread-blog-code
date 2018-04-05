package com.liumapp.blog.thread.basic;

/**
 * 错误的线程停止方式
 * @author liumapp
 * @file WrongStopThread.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/5/18
 */
public class WrongStopThread extends Thread {

    @Override
    public void run() {
        super.run();
        for (int i = 0 ; i < 50000000 ; i++) {
            if (this.isInterrupted()) {
                System.out.println("the thread think you want stop.");
                break;
            }
            System.out.println("i = " + i);
        }
        System.out.println("if you view this information , it means your thread stopped wrong ");
    }

}
