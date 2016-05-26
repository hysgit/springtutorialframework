package com.woslx.spring;

import com.woslx.spring.beans.Circle;
import com.woslx.spring.beans.ShapePainter;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hy on 16-5-26.
 */
public class Main {

    @Test
    public  void test1(){

        // Laod spring-config.xml file
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        //get circle bean defined in spring-config.xml file
        Circle circle =(Circle)ctx.getBean("circle2");

        //do something with the bean
        circle.draw();
        circle.area();
    }

    @Test
    public void test1_1()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        ShapePainter shapePainter = (ShapePainter) ctx.getBean("shapePainter2");
        System.out.println(shapePainter);
    }

    @Test
    public void test2()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        for(int i=0;i<3;i++) {
            System.out.println((ctx.getBean("circle2").hashCode()));
        }
        for(int i=0;i<3;i++) {
            System.out.println((ctx.getBean("circle3").hashCode()));
        }
    }

    @Test
    public void test3()
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        System.out.println((ctx.getBean("circle4").hashCode()));
    }


    @Test
    public void test5()
    {
        System.out.println("begin test5");
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        ShapePainter shapePainter = (ShapePainter) ctx.getBean("shapePainter5");
        System.out.println(shapePainter);
        System.out.println("end test5");
    }
    @Test
    public void test6() throws InterruptedException {

        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        for(int i=0;i<3;i++) {
            Circle shapePainter = (Circle) ctx.getBean("circle5");
            System.out.println(shapePainter.hashCode());
        }

        for(int i=0;i<3;i++) {
            Circle shapePainter = (Circle) ctx.getBean("circle6");
            System.out.println(shapePainter.hashCode());
        }
        ctx.close();
        Thread.sleep(10000);
    }
}
