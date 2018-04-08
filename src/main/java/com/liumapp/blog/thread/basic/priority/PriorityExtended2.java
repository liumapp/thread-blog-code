package com.liumapp.blog.thread.basic.priority;

/**
 * @author liumapp
 * @file PriorityExtended2.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 */
public class PriorityExtended2 extends Thread {

    @Override
    public void run() {
        System.out.println("PriorityExtended2 run and his priority = " + this.getPriority());
    }

}
