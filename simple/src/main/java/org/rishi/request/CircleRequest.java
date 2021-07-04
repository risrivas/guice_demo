package org.rishi.request;

import com.google.inject.Inject;
import org.rishi.annotations.Circle;
import org.rishi.service.DrawShape;

/**
 * Created by rishi on 15/06/2021
 * <p>
 * Constructor Injection
 */
public class CircleRequest {

    private final DrawShape drawShape;

    @Inject
    public CircleRequest(@Circle DrawShape drawShape) {
        this.drawShape = drawShape;
    }

    public void makeRequest() {
        drawShape.draw();
    }

}
