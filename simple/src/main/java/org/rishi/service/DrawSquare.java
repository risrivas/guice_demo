package org.rishi.service;

/**
 * Created by rishi on 15/06/2021
 */
public class DrawSquare implements DrawShape {

    private String color;
    private Integer edge;

    public DrawSquare(String color, Integer edge) {
        this.color = color;
        this.edge = edge;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing Square of color: %s and edge : %d%n", color, edge);
    }
}
