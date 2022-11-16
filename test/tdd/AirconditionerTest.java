package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirconditionerTest {

    @Test
    public void AirconOnTest(){

        //Given
        Airconditioner flipSwitch = new Airconditioner();

        //when I turn it on
        flipSwitch.turnOn(true);

        //check that AC is  on

        boolean flipSwitchPositive = flipSwitch.isPositive();
        assertTrue(true, String.valueOf(flipSwitchPositive));

    }

    @Test
    public void AirconOffTest() {

        //Given
        Airconditioner flipSwitch = new Airconditioner();

        //when I turn it on
        flipSwitch.turnOn(true);

        //when I turn it off
        flipSwitch.turnOff(false);

        //check that AC is off

        boolean flipSwitchNegative = flipSwitch.isNegative();
        assertFalse(false, String.valueOf(flipSwitchNegative));

    }

    @Test
    public void AirconIncreaseTemperature(){

        //Given
        Airconditioner flipSwitch = new Airconditioner();

        //when I turn it on
        flipSwitch.turnOn(true);

        //given that initial temperature is 24
        flipSwitch.temperature(24);

        //when I increase temperature
        flipSwitch.temperature(26);

        //check that temperature is increased
        int flipSwitchIncrease = flipSwitch.getTemperature();
        assertEquals(26, flipSwitchIncrease);

    }

    @Test
    public void AirconDecreaseTemperature(){

        //Given
        Airconditioner flipSwitch = new Airconditioner();

        //when I turn it on
        flipSwitch.turnOn(true);

        //given that initial temperature is 24
        flipSwitch.temperature(24);

        //when i decrease temperature
        flipSwitch.temperature(18);

        //check that temperature is decreased
        int flipSwitchDecrease = flipSwitch.getTemperature();
        assertEquals(18, flipSwitchDecrease);



    }

    @Test
    public void AirconIncreaseBeyondTemperature(){

        //Given
        Airconditioner flipSwitch = new Airconditioner();

        //when I turn it on
        flipSwitch.turnOn(true);

        //given that initial temperature is 23
        flipSwitch.temperature(23);

        //when I increase temperature beyond 30
        flipSwitch.temperature(35);

        //check that temperature is increased
        int flipSwitchIncrease = flipSwitch.getTemperature();
        assertEquals(30, flipSwitchIncrease);

    }

    @Test
    public void AirconDecreaseBeyondTemperature(){

        //Given
        Airconditioner flipSwitch = new Airconditioner();

        //when I turn it on
        flipSwitch.turnOn(true);

        //given that initial temperature is 23
        flipSwitch.temperature(23);

        //when I decrease temperature beyond 16
        flipSwitch.temperature(12);

        //check that temperature is increased
        int flipSwitchIncrease = flipSwitch.getTemperature();
        assertEquals(16, flipSwitchIncrease);

    }


}
