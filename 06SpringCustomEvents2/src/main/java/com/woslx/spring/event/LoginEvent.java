package com.woslx.spring.event;

import org.springframework.context.ApplicationEvent;

import java.util.Date;

/**
 * Created by hy on 16-5-27.
 */
public class LoginEvent extends ApplicationEvent  {


    private Date date;

    public LoginEvent(Object source){
        super(source);
        this.date = new Date(getTimestamp());
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
