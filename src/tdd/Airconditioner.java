package tdd;

public class Airconditioner {

    private boolean positive;


    public void turnOn(boolean condition1) {

        if (condition1) {
            positive = true;
        }

    }
    public boolean isPositive () {
        return positive;
    }

    private boolean negative;

    public void turnOff(boolean condition2) {

        if (condition2) {
            negative = false;
        }
    }

    public boolean isNegative () {
        return negative;
    }


    private int temperature;

    public void temperature(int degrees) {

        if (degrees>=16 && degrees<=30) {
            temperature = degrees;
        }
        if (degrees<16) {
            temperature = 16;
        }
        if (degrees>30) {
            temperature = 30;
        }

    }
        public int getTemperature () {
            return temperature;
        }

    }



