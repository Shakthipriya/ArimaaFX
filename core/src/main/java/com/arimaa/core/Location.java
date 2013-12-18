/*
 * Copyright 2013 Arimaa
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.arimaa.core;

/**
 *
 * @author Rajmahendra Hegde <rajmahendra@gmail.com>
 */
public enum Location {

    A1, A2, A3, A4, A5, A6, A7, A8,
    B1, B2, B3, B4, B5, B6, B7, B8,
    C1, C2, C3, C4, C5, C6, C7, C8,
    D1, D2, D3, D4, D5, D6, D7, D8,
    E1, E2, E3, E4, E5, E6, E7, E8,
    F1, F2, F3, F4, F5, F6, F7, F8,
    G1, G2, G3, G4, G5, G6, G7, G8,
    H1, H2, H3, H4, H5, H6, H7, H8;

    public static Location forCoordinates(int x, int y) {
        if (x < 1 || x > 8 || y < 1 || y > 8) {
            return null;
        }
        String xAsString = null;
        if (x == 1) {
            xAsString = "A";
        } else if (x == 2) {
            xAsString = "B";
        } else if (x == 3) {
            xAsString = "C";
        } else if (x == 4) {
            xAsString = "D";
        } else if (x == 5) {
            xAsString = "E";
        } else if (x == 6) {
            xAsString = "F";
        } else if (x == 7) {
            xAsString = "G";
        } else if (x == 8) {
            xAsString = "H";
        }
        String asString = xAsString + y;
        return Location.valueOf(asString);
    }

    public int getCoordinateX() {
        String letter = name().substring(0, 1);
        switch (letter) {
            case "A":
                return 1;
            case "B":
                return 2;
            case "C":
                return 3;
            case "D":
                return 4;
            case "E":
                return 5;
            case "F":
                return 6;
            case "G":
                return 7;
            case "H":
                return 8;
            default:
                return -1;
        }
    }

    public int getCoordinateY() {
        return Integer.valueOf(name().substring(1));
    }

    public Location add(int deltaX, int deltaY) {
        return Location.forCoordinates(getCoordinateX() + deltaX, getCoordinateY() + deltaY);
    }

}
