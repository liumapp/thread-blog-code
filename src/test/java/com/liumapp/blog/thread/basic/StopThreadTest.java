package com.liumapp.blog.thread.basic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liumapp
 * @file StopThreadTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/5/18
 */
@RunWith(SpringRunner.class)
public class StopThreadTest {

    @Test
    public void wrongWayTest () {
        try {
            WrongStopThread wrongStopThread= new WrongStopThread();
            wrongStopThread.start();
            wrongStopThread.sleep(2000);
            wrongStopThread.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void correctStopByException () {
        try {
            CorrectStopThreadByException correctStopThreadByException = new CorrectStopThreadByException();
            correctStopThreadByException.start();
            correctStopThreadByException.sleep(2000);
            correctStopThreadByException.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
    }

}
