package com.woslx.spring.beans;

/**
 * Created by hy on 16-5-26.
 */
public class ShapeBox {
    private Circle circle;

    public ShapeBox(){

    }

    public ShapeBox(Circle circle){
        System.out.println("ShapeBox autowire "+circle.getId()+" by constructor");
    }
    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
        System.out.println("ShapeBox autowire "+circle.getId()+" by "+circle.getAutowire());
    }

    public void setMethod(Circle circle)
    {
        System.out.println("myMethod invoked!");
    }

    @Override
    public String toString() {
        return "ShapeBox{" +
                "circle=" + circle +
                '}';
    }
}
