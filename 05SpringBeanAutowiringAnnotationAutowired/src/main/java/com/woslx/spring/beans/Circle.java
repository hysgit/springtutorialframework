package com.woslx.spring.beans;

/**
 * Created by hy on 16-5-26.
 */
public class Circle  {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Circle(){
    }

    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                '}';
    }
}
