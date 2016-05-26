package com.woslx.spring.beans2;

import com.woslx.spring.beans2.AnotherBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hy on 16-5-26.
 */
public class App2 {
    public static void main( String[] args )
    {

        ApplicationContext ctxAnnotation = new ClassPathXmlApplicationContext("XMLConfig-Annotation.xml");
        AnotherBean anotherBean  = (AnotherBean) ctxAnnotation.getBean("anotherBean");

        System.out.println(anotherBean);

    }
}
