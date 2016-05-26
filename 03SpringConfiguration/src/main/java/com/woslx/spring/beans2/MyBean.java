package com.woslx.spring.beans2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by hy on 16-5-26.
 */
@Component(value="myBean2")
public class MyBean {

//    @Value(value="AnnotationBean")
    private String name;

    public String getName() {
        return name;
    }

    @Value(value="AnnotationBean")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyBean [name1=" + name + "]";
    }
}