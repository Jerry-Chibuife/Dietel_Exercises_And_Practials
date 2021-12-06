package AirConditionerTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AcTest {
    AirConditioner thermocool;

    @BeforeEach
    public void beforeEveryTest(){
        thermocool = new AirConditioner("LG Thermocool");
    }

    @Test
    public void anAirConditionerCanBeTurnedOn(){
        assertFalse(thermocool.isOn());
        thermocool.turnOn();
        assertTrue(thermocool.isOn());
    }

    @Test
    public void anAirConditionerCanBeTurnedOff(){
        thermocool.turnOn();
        assertTrue(thermocool.isOn());
        thermocool.turnOff();
        assertFalse(thermocool.isOn());
    }

    @Test
    public void anAirConditionerCanBeIncreasedTest(){
        thermocool.turnOn();
        assertTrue(thermocool.isOn());
        int currentTemperature = thermocool.getTemperature();
        for(int i = 0; i <5; i++) {
            thermocool.increaseTemperature();
        }
        currentTemperature = thermocool.getTemperature();
        assertEquals(21, currentTemperature);
    }

    @Test
    public void anAirConditionerCanBeDecreasedTest(){
        thermocool.turnOn();
        assertTrue(thermocool.isOn());
        int currentTemperature = thermocool.getTemperature();
        for(int i = 0; i <5; i++) {
            thermocool.increaseTemperature();
        }
        currentTemperature = thermocool.getTemperature();
        assertEquals(21, currentTemperature);
        thermocool.decreaseTemperature();
        int newTemperature = thermocool.getTemperature();
        assertEquals(20, newTemperature);
    }

    @Test
    public void anAirConditionerCanNotIncreasePast30Test(){
        thermocool.turnOn();
        assertTrue(thermocool.isOn());
        int newTemperature = thermocool.getTemperature();
        assertEquals(16, newTemperature);
        for(int i = 0; i < 14; i++){
            thermocool.increaseTemperature();
        }
        int currentTemperature = thermocool.getTemperature();
        assertEquals(30, currentTemperature);
        thermocool.increaseTemperature();
        assertEquals(30, thermocool.getTemperature());
    }

    @Test
    public void anAirConditionerCanNotDecreaseBelow30Test(){
        thermocool.turnOn();
        assertTrue(thermocool.isOn());
        int newTemperature = thermocool.getTemperature();
        assertEquals(16, newTemperature);
        thermocool.decreaseTemperature();
        assertEquals(16, thermocool.getTemperature());
    }
}
