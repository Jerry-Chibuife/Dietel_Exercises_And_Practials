package AutomaticBike;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutobikeTest {
    Autobike powerBike;

    @BeforeEach
    public void beforeEachTest(){
        powerBike = new Autobike("Harley-Davidson");
    }


    @Test
    public void bikeCanBeTurnedOn(){
        assertFalse(powerBike.isOn);
        powerBike.turnItOn();
        assertTrue(powerBike.isOn);
    }

    @Test
    public void bikeCanBeTurnedOff(){
        powerBike.turnItOn();
        assertTrue(powerBike.isOn);
        powerBike.turnItOff();
        assertFalse(powerBike.isOn);
    }

    @Test
    public void bikeCanAccelerateInIncrements(){
        powerBike.turnItOn();
        assertTrue(powerBike.isOn);
        powerBike.accelerate();
        assertEquals(1, powerBike.getSpeed());
        assertEquals(1, powerBike.getGear());
        for(int i = 1; i <= 19; i++){
            powerBike.accelerate();
        }
        assertEquals(20, powerBike.getSpeed());
        assertEquals(1, powerBike.getGear());
        powerBike.accelerate();
        assertEquals(23, powerBike.getSpeed());
        assertEquals(2, powerBike.getGear());
        powerBike.accelerate();
        assertEquals(25, powerBike.getSpeed());
        for(int a = 1; a <= 3; a++){
            powerBike.accelerate();
        }
        assertEquals(34, powerBike.getSpeed());
        assertEquals(3, powerBike.getGear());

    }

    @Test
    public void bikeSpeedCanBeDecremented(){
        powerBike.turnItOn();
        assertTrue(powerBike.isOn);
        powerBike.decelerate();
        assertEquals(0, powerBike.getSpeed());
        for(int i = 1; i <= 20; i++){
            powerBike.accelerate();
        }
        assertEquals(20, powerBike.getSpeed());
        assertEquals(1, powerBike.getGear());
        for (int a =1; a <= 4; a++){
            powerBike.accelerate();
        }
        assertEquals(29, powerBike.getSpeed());
        powerBike.decelerate();
        powerBike.decelerate();
        assertEquals(25, powerBike.getSpeed());
        assertEquals(2, powerBike.getGear());
    }
}
