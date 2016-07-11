package com.woslx.spring;

import com.woslx.spring.beans.ShapeBox;
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
        ShapeBox shapeBox = (ShapeBox) ctx.getBean("shapeBox");
        System.out.println(shapeBox.toString());

        shapeBox = (ShapeBox) ctx.getBean("shapeBox2");
        System.out.println(shapeBox.toString());

        shapeBox = (ShapeBox) ctx.getBean("shapeBox3");
        System.out.println(shapeBox.toString());

        shapeBox = (ShapeBox) ctx.getBean("shapeBox4");
        System.out.println(shapeBox.toString());
    }
}
