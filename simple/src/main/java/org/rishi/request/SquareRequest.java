package org.rishi.request;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.rishi.service.DrawSquare;

/**
 * Created by rishi on 15/06/2021
 * <p>
 * Constructor Injection
 */
public class SquareRequest {

    private final Provider<DrawSquare> squareProvider;

    @Inject
    public SquareRequest(Provider<DrawSquare> squareProvider) {
        this.squareProvider = squareProvider;
    }

    public void makeRequest() {
        DrawSquare d1 = squareProvider.get();
        d1.draw();

        DrawSquare d2 = squareProvider.get();
        d2.draw();
        // drawShape.draw();
    }

}
