package org.rishi.request;

import org.rishi.service.DrawSquare;

/**
 * Created by rishi on 15/06/2021
 * <p>
 * Problems:
 * Tightly coupled
 * Breaks Single Responsibility Principle
 * Not good for Unit Tests
 */
public class SquareRequest {

    private final DrawSquare d = new DrawSquare();

    public void makeRequest() {
        d.draw();
    }

}
