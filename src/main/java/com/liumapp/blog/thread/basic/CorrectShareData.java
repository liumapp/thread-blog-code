package com.liumapp.blog.thread.basic;

/**
 * @author liumapp
 * @file CorrectShareData.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/24/18
 */
public class CorrectShareData extends Thread {

    private int count = 5;

    @Override
    synchronized public void run() {
        super.run();
        count--;
        System.out.println("由 " + this.currentThread().getName() + "计算，得到count = " + count);
    }

}
