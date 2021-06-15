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
            // SquareRequestCI r = new SquareRequestCI(d);
            SquareRequestCI r = injector.getInstance(SquareRequestCI.class);
            r.makeRequest();
        }
    }

    public static void main(String[] args) {
        sendRequest(SQUARE_REQ);
    }
}
