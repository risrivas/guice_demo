package org.rishi.providers;

import com.google.inject.Provider;
import org.rishi.service.DrawSquare;


/**
 * Created by rishi on 10/07/2021
 */
public class DrawShapeProvider implements Provider<DrawSquare> {

    @Override
    public DrawSquare get() {
        DrawSquare d = new DrawSquare("Red", 40);
        return d;
    }
}
