package com.liumapp.blog.thread.threadpool;

import com.liumapp.blog.thread.threadpool.runnable.SimpleMonitorThread;
import com.liumapp.blog.thread.threadpool.runnable.WorkerThread;
import com.liumapp.blog.thread.threadpool.service.RejectedExecutionHandlerImpl;

import java.util.concurrent.*;

/**
 * @author liumapp
 * @file ComplexPoolDemo.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/27/18
 */
public class ComplexPoolDemo {

    public static void main(String args[]) throws InterruptedException{
        //RejectedExecutionHandler implementation
        RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl();
        //Get the ThreadFactory implementation to use
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        //creating the ThreadPoolExecutor
        ThreadPoolExecutor executorPool = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2), threadFactory, rejectionHandler);
        //start the monitoring thread
        SimpleMonitorThread monitor = new SimpleMonitorThread(executorPool, 3);
        Thread monitorThread = new Thread(monitor);
        monitorThread.start();
        //submit work to the thread pool
        for(int i=0; i<10; i++){
            executorPool.execute(new WorkerThread("cmd"+i));
        }

        Thread.sleep(300);
        //shut down the pool
        executorPool.shutdown();
        while(!executorPool.isTerminated()) {
        }
        //shut down the monitor thread
        Thread.sleep(500);
        monitor.shutdown();

    }

}
