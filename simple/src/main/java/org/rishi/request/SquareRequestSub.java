package org.rishi.request;

import com.google.inject.Inject;
import org.rishi.service.DrawShape;

/**
 * Created by rishi on 16/06/2021
 */
public class SquareRequestSub extends SquareRequestCI {

    @Inject
    public SquareRequestSub(DrawShape d) {
        super(d);
    }

    @Override
    public void makeRequest() {
        System.out.println("Subclass - delegating to draw");
        d.draw();
    }
}
