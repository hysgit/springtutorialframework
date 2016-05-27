package com.woslx.spring.beans;

import com.woslx.spring.event.LoginEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by hy on 16-5-27.
 */
public class Login implements ApplicationEventPublisherAware {

    private String username;
    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void login(){

        //do the login..

        //fire the event
        LoginEvent event = new LoginEvent(this);
        publisher.publishEvent(event);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
