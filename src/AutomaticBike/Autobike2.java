package AutomaticBike;

public class Autobike2 {
    public boolean isOn;
    private String bikeName;
    private int speed;
    private int gear;

    public Autobike2(String bikeName) {
        this.bikeName = bikeName;
    }


    public void turnItOn() {
        isOn = true;
    }

    public void turnItOff() {
        isOn = false;
    }

    public void accelerate(int gear) {
        this.gear = gear;
        if(this.gear == 1) {
            speed++;
            if (speed > 20) {
                gear = 2;
                this.gear = gear;
            }
        }
        if(this.gear == 2) {
            speed += 2;
            if(speed > 30){
                gear = 3;
                this.gear = gear;
            }
        }
        if(this.gear == 3) {
            speed += 3;
            if(speed > 40){
                gear = 4;
                this.gear = gear;
            }
        }
        if(this.gear == 4) {
            speed += 4;
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void decelerate(int gear) {
        if(gear == 1) {
            this.gear = gear;
            speed--;
        }
        if(gear == 2) {
            this.gear = gear;
            speed -= 2;
        }
        if(gear == 3) {
            this.gear = gear;
            speed -= 3;
        }
        if(gear == 4) {
            this.gear = gear;
            speed -= 4;
        }
    }

    public int getGear() {
        return gear;
    }
}
