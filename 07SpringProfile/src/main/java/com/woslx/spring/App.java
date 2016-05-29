package com.woslx.spring;

import com.woslx.spring.vo.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("development"); //or production
        ctx.scan("com.woslx.spring"); // register all @Configuration classes
        //ctx.register(SpringConfigDev.class);
        ctx.refresh();
        Person person = (Person)ctx.getBean("person");

        System.out.println("Person: "+person);
    }
}
