package org.rishi.module;

import com.google.inject.AbstractModule;
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
        bind(DrawShape.class).to(DrawSquare.class);
        bind(SquareRequestCI.class).to(SquareRequestSub.class);
    }
}
