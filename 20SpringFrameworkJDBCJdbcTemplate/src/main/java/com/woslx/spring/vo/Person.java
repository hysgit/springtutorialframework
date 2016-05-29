package com.woslx.spring.vo;

/**
 * Created by hy on 16-5-29.
 */
public class Person {
    int id;
    String name;

    //setter & getter.....

    public String toString(){
        return "ID: "+id+" Name: "+name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
