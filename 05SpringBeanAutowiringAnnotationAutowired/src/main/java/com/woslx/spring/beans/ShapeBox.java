package com.woslx.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by hy on 16-5-26.
 */
public class ShapeBox {
    //( 1 ) Autowired property

    //autowire property even if no set method is defined!
    @Autowired
    private Circle circle;

    //autowire property
    //reuqired=false -> it is OK if no Triangle bean exists!
    @Autowired(required=false)
    private Triangle triangle;

    //( 2 ) Autowire constructor argument
    @Autowired
    public ShapeBox(Rectangle rectangle){
        System.out.println("Rectangle has been autowired to constructor");
    }

    //( 3 ) Autowire a method

    //autowire a set method
    //this example shows that cirlce has been set before set method is called
    @Autowired
    public void setCircle(Circle circle) {
        if(this.circle != null ){
            System.out.println("Circle has been autowired to property \""+
                    "this setCircle has been called because it has @Autowired\"");
        }
        else{
            this.circle = circle;
            System.out.println("Circle has been autowired to setCircle");
        }
    }

    //autowire a method (NOT necessarily set method)
    //@Qualifier --> autowire bean named "c2"
    @Autowired
    @Qualifier("c2")
    public void drawCircle(Circle circle) {
        System.out.println("Drawing autowired Circle (c2) ");
    }
}
