package com.woslx.spring;

import com.woslx.spring.beans.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hy on 16-5-26.
 */
public class Main {
    public static void main(String args[]){

        // Laod spring-config.xml file
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        //get circle bean defined in spring-config.xml file
        Circle circle =(Circle)ctx.getBean("circle");

        //do something with the bean
        circle.setRadius(3.0);
        circle.draw();
        circle.area();
    }
}
