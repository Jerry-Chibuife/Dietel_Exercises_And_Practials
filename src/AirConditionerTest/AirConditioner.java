package AirConditionerTest;

public class AirConditioner {
    private boolean isOn;
    private String productName;
    private int temperature = 16;

    public AirConditioner(String airConditionerName){
        productName = airConditionerName;
    }

    public boolean isOn() {
        return isOn;
    }


    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if(temperature < 30)
        temperature++;
    }

    public void decreaseTemperature() {
        if(temperature > 16)
        temperature--;
    }
}
