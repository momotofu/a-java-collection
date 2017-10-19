package com.company;

public class HotChocolate {

    public static final double tooHot = 185;
    public static final double tooCold = 160;

    public static void drink(double temp) throws TemperatureException {
        if (temp >= tooHot) {
            throw new TooHotException();
        } else if (temp <= tooCold) {
            throw new TooColdException();
        } else {
            System.out.println("Mhmmhum.. the temp is just right! Yummy.");
        }
    }
}
