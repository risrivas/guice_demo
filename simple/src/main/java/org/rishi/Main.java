package org.rishi;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.rishi.module.AppModule;
import org.rishi.request.SquareRequestCI;

/**
 * Created by rishi on 15/06/2021
 */
public class Main {

    public static final String SQUARE_REQ = "SQUARE";

    private static void sendRequest(String req) {
        if (req.equals(SQUARE_REQ)) {
            // DrawShape d = new DrawSquare();

            Injector injector = Guice.createInjector(new AppModule());
            // DrawShape d = injector.getInstance(DrawShape.class);
            // SquareRequestCI request = new SquareRequestCI(d);
            SquareRequestCI request1 = injector.getInstance(SquareRequestCI.class);
            request1.makeRequest();

            SquareRequestCI request2 = injector.getInstance(SquareRequestCI.class);
            request2.makeRequest();

            boolean areDrawShapesEqual = request1.getDrawShape() == request2.getDrawShape();
            System.out.println("Are draw shapes equal? " + areDrawShapesEqual);

            boolean areShapeRequestsEqual = request1 == request2;
            System.out.println("Are shape requests equal? " + areShapeRequestsEqual);
        }
    }

    public static void main(String[] args) {
        sendRequest(SQUARE_REQ);
    }
}
