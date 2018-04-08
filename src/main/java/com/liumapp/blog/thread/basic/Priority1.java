package com.liumapp.blog.thread.basic;

/**
 * @author liumapp
 * @file Priority1.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 */
public class Priority1 extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("Priority1 run with his priority is : " + this.getPriority());
        Priority2 priority2 = new Priority2();
        priority2.start();
    }
}
