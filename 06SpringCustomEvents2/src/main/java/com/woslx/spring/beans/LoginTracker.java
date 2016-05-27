package com.woslx.spring.beans;

import com.woslx.spring.event.LoginEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by hy on 16-5-27.
 */
public class LoginTracker implements ApplicationListener<LoginEvent>  {

    @Override
    public void onApplicationEvent(LoginEvent event) {

        System.out.println("\n"+((Login)event.getSource()).getUsername()+" logged-in @ "+event.getDate()+"\n");

    }
}
