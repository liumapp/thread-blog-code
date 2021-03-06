package com.liumapp.blog.thread.threadpool.scheduler;

import com.liumapp.blog.thread.threadpool.runnable.WorkerThread;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author liumapp
 * @file ScheduledThreadPool.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/27/18
 */
public class ScheduledThreadPool {

    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

        //schedule to run after sometime
        System.out.println("Current Time = "+new Date());
        for(int i=0; i<3; i++){
            Thread.sleep(1000);
            WorkerThread worker = new WorkerThread("do heavy processing");
            scheduledThreadPool.schedule(worker, 10, TimeUnit.SECONDS);
        }

        //add some delay to let some threads spawn by scheduler
        Thread.sleep(300);

        scheduledThreadPool.shutdown();
        while(!scheduledThreadPool.isTerminated()){
            //wait for all tasks to finish
        }
        System.out.println("Finished all threads");
    }


}
