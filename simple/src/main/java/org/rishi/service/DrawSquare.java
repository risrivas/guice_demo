package org.rishi.service;

import com.google.inject.Inject;
import org.rishi.annotations.EdgeSize;
import org.rishi.annotations.SquareColorValue;

/**
 * Created by rishi on 15/06/2021
 */
public class DrawSquare implements DrawShape {

    private String color;
    private Integer edge;

    private final Thread t = new Thread(() ->
            System.out.printf("Drawing Square of color: %s and edge : %d%n", color, edge)
    );

    @Inject
    public DrawSquare(@SquareColorValue String color, @EdgeSize Integer edge) {
        this.color = color;
        this.edge = edge;
    }

    @Override
    public void draw() {
        t.start();
    }
}
