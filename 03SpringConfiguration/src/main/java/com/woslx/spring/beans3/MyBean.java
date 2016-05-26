package com.woslx.spring.beans3;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by hy on 16-5-26.
 */
public class MyBean {
    private String name;

    public String getName() {
        return name;
    }

    @Value(value="JavaConfigBean")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyBean [name=" + name + "]";
    }
}
