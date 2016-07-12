package com.woslx.spring.beans;

import java.util.Calendar;

public class Logger {

	public void log(){
		System.out.println("user has logged in @"+Calendar.getInstance().getTime());
	}
}
