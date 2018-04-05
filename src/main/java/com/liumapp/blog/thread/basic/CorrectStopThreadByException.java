package com.liumapp.blog.thread.basic;

/**
 * 利用异常来正确的停止线程
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
                if (this.isInterrupted()) {
                    System.out.println("the thread think you want stop.");
//                    throw new InterruptedException();
                }
            }
        }
    }

}
