package org.rishi.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.rishi.service.DrawShape;
import org.rishi.service.DrawSquare;

/**
 * Created by rishi on 15/06/2021
 */
public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        // bind(DrawShape.class).to(DrawSquare.class);
    }

    @Provides
    DrawShape providesDrawSquare() {
        DrawShape d = new DrawSquare("Red", 40);
        return d;
    }
}
