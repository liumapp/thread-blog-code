package com.liumapp.blog.thread.basic;

/**
 * 利用异常来正确的停止线程
 * 或者也可以利用return
 * @author liumapp
 * @file CorrectStopThreadByException.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/5/18
 */
public class CorrectStopThreadByException extends Thread {

    @Override
    public void run() {
        super.run();
        try {
            for (int i = 0 ; i < 50000000 ; i++) {
                System.out.println("i = " + i);
                if (this.isInterrupted()) {
                    System.out.println("the thread think you want stop.");
                    throw new InterruptedException();//或者使用return进行停止
                }
            }
            System.out.println("after for .  this will not be executed");
        } catch (InterruptedException e) {
            System.out.println("in exception catch method");
            e.printStackTrace();
        }
    }

}
