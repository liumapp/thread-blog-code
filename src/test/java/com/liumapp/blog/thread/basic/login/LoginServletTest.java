package com.liumapp.blog.thread.basic.login;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liumapp
 * @file LoginServletTest.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/24/18
 */
@RunWith(SpringRunner.class)
public class LoginServletTest {

    @Test
    public void startWrongLogin () {
        WrongALogin a = new WrongALogin();
        a.start();
        WrongBLogin b = new WrongBLogin();
        b.start();
    }

    @Test
    public void startCorrectLogin () {
        CorrectALogin a = new CorrectALogin();
        a.start();
        CorrectBLogin b = new CorrectBLogin();
        b.start();
    }
}
