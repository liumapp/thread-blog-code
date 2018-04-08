package com.liumapp.blog.thread.basic.priority;

/**
 * @author liumapp
 * @file PriorityExtended1.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/8/18
 */
public class PriorityExtended1 extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("PriorityExtended1 run with his priority is : " + this.getPriority());
        PriorityExtended2 priorityExtended2 = new PriorityExtended2();
        priorityExtended2.start();
    }
}
