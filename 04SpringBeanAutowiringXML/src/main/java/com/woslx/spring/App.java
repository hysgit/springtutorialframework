package com.woslx.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static ApplicationContext ctx;
    public static void main(String args[]){

        // Laod spring-config.xml file
        ctx = new ClassPathXmlApplicationContext("spring-config.xml");

    }
}
