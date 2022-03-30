package Interface.EX01;

import Interface.EX01.Bicycle;

public class MountainBike implements Bicycle {
    private int seatHeight;
    private int gear;
    private int speed;

    public MountainBike(int height, int speed, int gear){
        this.seatHeight = height;
        this.speed = speed;
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void applyBreak(int decrement) {
        this.speed -= decrement;
    }

    @Override
    public void speedUp(int increment) {
        this.speed += increment;
    }
}
