package com.woslx.spring.beans;

import java.util.Calendar;

import org.aspectj.lang.annotation.*;

@Aspect
public class Logger {
	
	@After("execution(* com.woslx.spring.beans.User.login(..))")
	public void log(){
		System.out.println("after user  login @"+Calendar.getInstance().getTime());
	}

	@Before("execution(* com.woslx.spring.beans.User.login(..))")
	public void after()
	{
		System.out.println("before user login @ "+Calendar.getInstance().getTime());
	}

//	@Around("execution(* com.woslx.spring.beans.User.login(..))")
//	public void around()
//	{
//		System.out.println("around user login @ "+Calendar.getInstance().getTime());
//	}

	@AfterReturning("execution(* com.woslx.spring.beans.User.login(..))")
	public void afterReturning()
	{
		System.out.println("AfterReturning user login @ "+Calendar.getInstance().getTime());
	}

}
