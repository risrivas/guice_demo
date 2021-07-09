package org.rishi.providers;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.rishi.annotations.EdgeSize;
import org.rishi.annotations.SquareColorValue;
import org.rishi.service.DrawSquare;


/**
 * Created by rishi on 10/07/2021
 */
public class DrawSquareProvider implements Provider<DrawSquare> {

    private String color;
    private Integer edge;

    @Inject
    public DrawSquareProvider(@SquareColorValue String color, @EdgeSize Integer edge) {
        this.color = color;
        this.edge = edge;
    }

    @Override
    public DrawSquare get() {
        DrawSquare d = new DrawSquare(color, edge);
        return d;
    }
}
