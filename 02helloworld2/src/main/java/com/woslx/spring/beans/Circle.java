package com.woslx.spring.beans;

/**
 * Created by hy on 16-5-26.
 */
public class Circle implements Shape {
    double radius;


    public Circle(){
        System.out.println("Circle has been created!");
    }

    public Circle(double radius){
        this.radius = radius;
        System.out.println("Circle has been created radius = "+radius);
    }

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
