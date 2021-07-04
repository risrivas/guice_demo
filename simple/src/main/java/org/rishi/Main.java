package org.rishi;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.rishi.module.AppModule;
import org.rishi.request.CircleRequest;
import org.rishi.request.SquareRequest;

/**
 * Created by rishi on 15/06/2021
 */
public class Main {

    public static final String SQUARE_REQ = "SQUARE";
    public static final String CIRCLE_REQ = "CIRCLE";

    private static void sendRequest(String req) {
        if (req.equals(SQUARE_REQ)) {
            Injector injector = Guice.createInjector(new AppModule());
            SquareRequest request = injector.getInstance(SquareRequest.class);
            request.makeRequest();
        }

        if (req.equals(CIRCLE_REQ)) {
            Injector injector = Guice.createInjector(new AppModule());
            CircleRequest request = injector.getInstance(CircleRequest.class);
            request.makeRequest();
        }
    }

    public static void main(String[] args) {
//        sendRequest(SQUARE_REQ);
        sendRequest(CIRCLE_REQ);
    }
}
