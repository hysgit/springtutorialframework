package com.woslx.spring;

import com.woslx.spring.beans.Login;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");

        Login login = (Login) ctx.getBean("login");
        login.login();
    }

}
