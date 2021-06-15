package org.rishi;

import org.rishi.request.SquareRequestCI;
import org.rishi.service.DrawSquare;

/**
 * Created by rishi on 15/06/2021
 */
public class Main {
    public static void main(String[] args) {
//        SquareRequest r = new SquareRequest();
        SquareRequestCI r = new SquareRequestCI(new DrawSquare());
        r.makeRequest();
    }
}
