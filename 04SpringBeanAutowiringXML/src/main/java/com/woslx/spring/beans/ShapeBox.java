package com.woslx.spring.beans;

/**
 * Created by hy on 16-5-26.
 */
public class ShapeBox {
    private Circle circle;

    public ShapeBox() {

    }

    public ShapeBox(Circle circle) {
        this.circle=circle;
        System.out.println("ShapeBox autowire " + circle.getId() + " by constructor");
    }

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
        System.out.println("ShapeBox autowire " + circle.getId() + " by " + circle.getAutowire());
    }

    public void setMethod(Circle circle) {
        System.out.println("myMethod invoked!");
    }

    public void setCate(Circle circle) {
        System.out.println("setCate invoked!");
    }

        public void setCircle3(Circle2 circle) {
        System.out.println("setCircle2 invoked!");
    }
    public void setMethod2(Circle c2) {
        System.out.println("setMethod2 invoked!"+c2);
    }



    public void seate(Circle circle) {
        System.out.println("seate invoked!");
    }

    @Override
    public String toString() {
        return "ShapeBox{" +
                "circle=" + circle +
                '}';
    }
}
