package org.rishi.module;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import org.rishi.annotations.ColorValue;
import org.rishi.annotations.EdgeValue;
import org.rishi.request.SquareRequestCI;
import org.rishi.request.SquareRequestSub;
import org.rishi.service.DrawShape;
import org.rishi.service.DrawSquare;

/**
 * Created by rishi on 15/06/2021
 */
public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON);
        bind(SquareRequestCI.class).to(SquareRequestSub.class).in(Scopes.SINGLETON);
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(40);
    }
}
