package com.liumapp.blog.thread.basic;

/**
 * @author liumapp
 * @file Priority2.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 */
public class Priority2 extends Thread {

    @Override
    public void run() {
        System.out.println("Priority2 run and his priority = " + this.getPriority());
    }

}
