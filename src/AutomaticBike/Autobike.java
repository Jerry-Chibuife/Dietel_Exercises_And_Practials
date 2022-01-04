package AutomaticBike;

public class Autobike {

    public boolean isOn;
    private int speed;
    private int gear = 1;

    public Autobike(String bikeName) {

    }

    public void turnItOn() {
        isOn = true;
    }

    public void turnItOff() {
        isOn = false;
    }

    public void accelerate() {
        if(speed >= 0) {
            if(speed <= 20) {
                speed++;
                gear = 1;
            }
        }
        if(speed > 20){
            speed += 2;
            gear = 2;
        }
        if(speed > 30) {
            gear = 3;
            speed += 3;
        }
        if(speed > 40){
            gear = 4;
            speed += 4;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public int getGear() {
        return gear;
    }

    public void decelerate() {
        if(speed > 0) {
            if(speed < 21) {
                speed--;
                gear = 1;
            }
        }
        if(speed > 20) {
            if (speed < 31) {
                speed -= 2;
                gear = 2;
            }
        }
        if(speed > 30) {
            if (speed < 41) {
                speed -= 3;
                gear = 3;
            }
        }
        if(speed > 40) {
            speed -= 4;
            gear = 4;
        }
    }
}
