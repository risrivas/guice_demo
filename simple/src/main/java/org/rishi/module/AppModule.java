package org.rishi.module;

import com.google.inject.AbstractModule;
import org.rishi.annotations.Circle;
import org.rishi.annotations.ColorValue;
import org.rishi.annotations.EdgeValue;
import org.rishi.annotations.Square;
import org.rishi.service.DrawCircle;
import org.rishi.service.DrawShape;
import org.rishi.service.DrawSquare;

/**
 * Created by rishi on 15/06/2021
 */
public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(DrawShape.class).annotatedWith(Square.class).to(DrawSquare.class);
        bind(DrawShape.class).annotatedWith(Circle.class).to(DrawCircle.class);
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(40);
    }
}
