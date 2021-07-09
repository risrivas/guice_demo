package org.rishi.providers;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.rishi.annotations.CircleColorValue;
import org.rishi.annotations.EdgeSize;
import org.rishi.annotations.Radius;
import org.rishi.annotations.SquareColorValue;
import org.rishi.service.DrawCircle;
import org.rishi.service.DrawSquare;


/**
 * Created by rishi on 10/07/2021
 */
public class DrawCircleProvider implements Provider<DrawCircle> {

    private String color;
    private Integer radius;

    @Inject
    public DrawCircleProvider(@CircleColorValue String color, @Radius Integer radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public DrawCircle get() {
        DrawCircle d = new DrawCircle(color, radius);
        return d;
    }
}
