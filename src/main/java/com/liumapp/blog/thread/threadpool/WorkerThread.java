package com.liumapp.blog.thread.threadpool;

/**
 * @author liumapp
 * @file WorkerThread.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/27/18
 */
public class WorkerThread implements Runnable {

    private String command;

    public WorkerThread(String s){
        this.command=s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Start. Command = "+command);
        processCommand();
        System.out.println(Thread.currentThread().getName()+" End.");
    }

    private void processCommand() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString(){
        return this.command;
    }

}
