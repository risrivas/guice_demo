package org.rishi.module;

import com.google.inject.AbstractModule;
import org.rishi.annotations.EdgeSize;
import org.rishi.annotations.SquareColorValue;
import org.rishi.service.DrawShape;

/**
 * Created by rishi on 15/06/2021
 */
public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
//        bind(DrawShape.class).annotatedWith(Square.class).toProvider(DrawSquareProvider.class).in(Scopes.SINGLETON);
        // bind(DrawShape.class).toProvider(DrawSquareProvider.class);
        bind(String.class).annotatedWith(SquareColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeSize.class).toInstance(40);

//        bind(DrawShape.class).annotatedWith(Circle.class).toProvider(DrawCircleProvider.class).in(Scopes.SINGLETON);
//        bind(String.class).annotatedWith(CircleColorValue.class).toInstance("Blue");
//        bind(Integer.class).annotatedWith(Radius.class).toInstance(5);
    }

}
