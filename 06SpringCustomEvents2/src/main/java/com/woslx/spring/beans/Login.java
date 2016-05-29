package com.woslx.spring.beans;

import com.woslx.spring.event.LoginEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import sun.java2d.opengl.GLXSurfaceData;

/**
 * Created by hy on 16-5-27.
 */
public class Login implements ApplicationEventPublisherAware {

    private String username;
    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        System.out.println("publisher.hashCode(): "+publisher.hashCode());
        //这个事件发布器，实际上就是容器本身，这个方法，在容器实例化这个bean的时候，
        // 会被容器在创建的这个类的对象上调用，调用的时候，传进来容器本身
        this.publisher = publisher;
    }

    public void login(){
        //这里会发布一个事件，所以要先建立一个事件。这里事件源，就是建立这个事件的对象
        LoginEvent event = new LoginEvent(this);
        //调用事件发布者的发布事件方法，发布事件
        publisher.publishEvent(event);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
