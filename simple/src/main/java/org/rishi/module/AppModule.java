package org.rishi.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import org.rishi.annotations.ColorValue;
import org.rishi.annotations.EdgeSize;
import org.rishi.service.DrawShape;
import org.rishi.service.DrawSquare;

/**
 * Created by rishi on 15/06/2021
 */
public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        // bind(DrawShape.class).to(DrawSquare.class);
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeSize.class).toInstance(40);
    }

    @Provides
    @Singleton
    DrawShape providesDrawSquare(@ColorValue String color, @EdgeSize Integer edge) {
        DrawShape d = new DrawSquare(color, edge);
        return d;
    }
}
