package com.woslx.spring.beans3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by hy on 16-5-26.
 */
public class App {
    public static void main( String[] args )
    {
        ApplicationContext ctxJavaConfig = new AnnotationConfigApplicationContext(JavaConfig.class);
        AnotherBean anotherBean = (AnotherBean) ctxJavaConfig.getBean("anotherBean2");
        System.out.println( anotherBean);
        ctxJavaConfig.getBean("myBean");
    }
}
