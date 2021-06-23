package org.rishi.request;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.rishi.service.DrawShape;

/**
 * Created by rishi on 15/06/2021
 * <p>
 * Constructor Injection
 */
public class SquareRequest {

    private final DrawShape drawShape;

    @Inject
    public SquareRequest(@Named("Square") DrawShape drawShape) {
        this.drawShape = drawShape;
    }

    public void makeRequest() {
        drawShape.draw();
    }

}
