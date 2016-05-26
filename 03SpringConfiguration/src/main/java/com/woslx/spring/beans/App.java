package com.woslx.spring.beans;

import com.woslx.spring.beans.AnotherBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by hy on 16-5-26.
 */
public class App {
  public static void main( String[] args )
        {
            ApplicationContext ctxXML = new ClassPathXmlApplicationContext("XMLConfig.xml");
            AnotherBean anotherBean = (AnotherBean) ctxXML.getBean("anotherBean");

            System.out.println( anotherBean);
        }

}
