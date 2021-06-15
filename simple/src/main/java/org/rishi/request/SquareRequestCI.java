package org.rishi.request;

import org.rishi.service.DrawShape;

/**
 * Created by rishi on 15/06/2021
 * <p>
 * Constructor Injection
 */
public class SquareRequestCI {

    private final DrawShape d;

    public SquareRequestCI(DrawShape d) {
        this.d = d;
    }

    public void makeRequest() {
        d.draw();
    }
}
