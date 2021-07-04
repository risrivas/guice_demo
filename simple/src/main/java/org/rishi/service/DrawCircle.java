package org.rishi.service;

/**
 * Created by rishi on 15/06/2021
 */
public class DrawCircle implements DrawShape {

    private String color;
    private Integer radius;

    public DrawCircle(String color, Integer radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing Circle of color: %s and radius : %d%n", color, radius);
    }
}
