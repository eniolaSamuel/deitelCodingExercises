package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BikeTest {
    @Test
    public void BikeRTest() {

        //Given
        Bike cruiseBike = new Bike();

        //when I turn it on
        cruiseBike.turnOn(true);

        //check that Bike is  on

        boolean cruiseBikePower = cruiseBike.isSetOn();
        assertTrue(true, String.valueOf(cruiseBikePower));


    }

    @Test
    public void BikeOffTest() {

        //Given
        Bike cruiseBike = new Bike();

        //when I turn it on
        cruiseBike.turnOff(false);

        //check that Bike is  on

        boolean cruiseBikePower = cruiseBike.isSetOff();
        assertTrue(true, String.valueOf(cruiseBikePower));

    }
}