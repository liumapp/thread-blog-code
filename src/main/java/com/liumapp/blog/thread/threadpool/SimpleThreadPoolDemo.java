package com.liumapp.blog.thread.threadpool;

import com.liumapp.blog.thread.threadpool.runnable.WorkerThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author liumapp
 * @file SimpleThreadPoolDemo.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/27/18
 */
public class SimpleThreadPoolDemo {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {
        }
        System.out.println("Finished all threads");
    }

}
