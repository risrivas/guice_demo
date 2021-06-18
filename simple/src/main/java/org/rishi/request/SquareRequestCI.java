package org.rishi.request;

import com.google.inject.Inject;
import org.rishi.service.DrawShape;

/**
 * Created by rishi on 15/06/2021
 * <p>
 * Constructor Injection
 */
public class SquareRequestCI {

    protected final DrawShape drawShape;

    @Inject
    public SquareRequestCI(DrawShape drawShape) {
        this.drawShape = drawShape;
    }

    public void makeRequest() {
        drawShape.draw();
    }

    public DrawShape getDrawShape() {
        return drawShape;
    }
}
