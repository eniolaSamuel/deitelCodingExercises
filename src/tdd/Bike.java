package tdd;

public class Bike {

    private boolean setOn;

    public void turnOn(boolean condition) {

        if(condition) {
            setOn = true;
        }
    }

    public boolean isSetOn() {
        return setOn;
    }

    private boolean setOff;

    public void turnOff(boolean condition) {

        if(condition) {
            setOff = false;
        }
    }

    public boolean isSetOff() {
        return setOff;
    }
}
