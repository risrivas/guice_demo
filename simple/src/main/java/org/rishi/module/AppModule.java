package org.rishi.module;

import com.google.inject.AbstractModule;
import org.rishi.providers.DrawShapeProvider;
import org.rishi.service.DrawShape;

/**
 * Created by rishi on 15/06/2021
 */
public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(DrawShape.class).toProvider(DrawShapeProvider.class);
    }

}
