package com.woslx.spring.beans;

/**
 * Created by hy on 16-5-26.
 */
public class Circle {
    private String autowire;
    private String id;
    public Circle(){
    }

    public String getAutowire() {
        return autowire;
    }

    public void setAutowire(String autowire) {
        this.autowire = autowire;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "autowire='" + autowire + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
