package org.rishi.service;

import com.google.inject.Inject;
import org.rishi.annotations.ColorValue;
import org.rishi.annotations.EdgeValue;

/**
 * Created by rishi on 15/06/2021
 */
public class DrawSquare implements DrawShape {

    private String color;
    private Integer edge;

    @Inject
    public DrawSquare(@ColorValue String color, @EdgeValue Integer edge) {
        super();
        this.color = color;
        this.edge = edge;
    }

    @Override
    public void draw() {
        System.out.printf("Drawing Square of color: %s and edge: %d%n", color, edge);
    }
}
