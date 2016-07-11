package com.woslx.spring.test;

import com.woslx.spring.beans.Shape;

/**
 * Created by hy on 16-5-30.
 */
public class Circle2 implements Shape {
    private double radius;
    private Integer d;
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public Circle2(String str) {
        this.str = str;
    }

//    public Circle2(Integer d) {
//        this.d = d;
//    }

    public Integer getD() {
        return d;
    }

    public void setD(Integer d) {
        this.d = d;
    }

    public Circle2(){
        System.out.println("Circle has been created!");
    }

//    public Circle2(double radius){
//        this.radius = radius;
//        System.out.println("Circle has been created radius = "+radius);
//    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        System.out.println("Circle's setRadius method is invoked!");
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Drawing Circle");
    }
    public void area(){
        System.out.println("Area = "+Math.PI*Math.pow(radius, 2));
    }

    public void destroy_method()
    {
        System.out.println("Circle: "+ hashCode() + " will be destroyed!" );
    }
}