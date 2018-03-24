package com.liumapp.blog.thread.basic.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liumapp
 * @file CorrectLoginServlet.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 3/24/18
 */
public class CorrectLoginServlet {

    private static Logger logger = LoggerFactory.getLogger(WrongLoginServlet.class);

    private static String usernameRef;

    private static String passwordRef;

    synchronized public static void doPost (String username , String password) {
        usernameRef = username;
        passwordRef = password;
        logger.info("username = " + usernameRef + " and password = " + passwordRef);
    }

}
