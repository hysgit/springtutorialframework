package com.woslx.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hy on 16-5-26.
 */
public class Main {
    public static ApplicationContext ctx;
    public static void main(String args[]){

        // Laod spring-config.xml file
        ctx = new ClassPathXmlApplicationContext("spring-config.xml");
//        System.out.println(ctx.getBean("circle").toString());
        System.out.println(ctx.getBean("c2").toString());
        System.out.println(ctx.getBean("shapeBox").toString());

    }
}
