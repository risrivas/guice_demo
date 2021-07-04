package org.rishi.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import org.rishi.annotations.*;
import org.rishi.service.DrawCircle;
import org.rishi.service.DrawShape;
import org.rishi.service.DrawSquare;

/**
 * Created by rishi on 15/06/2021
 */
public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        // bind(DrawShape.class).to(DrawSquare.class);
        bind(String.class).annotatedWith(SquareColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeSize.class).toInstance(40);

        bind(String.class).annotatedWith(CircleColorValue.class).toInstance("Blue");
        bind(Integer.class).annotatedWith(Radius.class).toInstance(5);
    }

    @Provides
    @Singleton
    @Square
    DrawShape providesDrawSquare(@SquareColorValue String color, @EdgeSize Integer edge) {
        DrawShape d = new DrawSquare(color, edge);
        return d;
    }

    @Provides
    @Singleton
    @Circle
    DrawShape providesDrawCircle(@CircleColorValue String color, @Radius Integer radius) {
        DrawShape d = new DrawCircle(color, radius);
        return d;
    }
}
