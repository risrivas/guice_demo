package org.rishi.request;

import com.google.inject.Inject;
import org.rishi.service.DrawShape;

/**
 * Created by rishi on 15/06/2021
 * <p>
 * Constructor Injection
 */
public class SquareRequest {

    // Field injection
    @Inject
    private DrawShape drawShape;

    // Constructor Injection
    /*@Inject
    public SquareRequest(DrawShape drawShape) {
        this.drawShape = drawShape;
    }*/

    // Method injection
    /*@Inject
    public void setDrawShape(DrawShape drawShape) {
        this.drawShape = drawShape;
    }*/

    public void makeRequest() {
        drawShape.draw();
    }

    public DrawShape getDrawShape() {
        return drawShape;
    }
}
