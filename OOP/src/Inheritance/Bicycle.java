package Inheritance;

public class Bicycle {
    protected int gear;
    protected int speed;

    public Bicycle(int startSpeed, int startGear){
        this.gear = startGear;
        this.speed = startSpeed;
    }

    public void setGear(int value){
        this.gear = value;
    }
    public void applyBreak(int decrement){
        this.speed -= decrement;
    }
    public void speedUp(int increment){
        this.speed += increment;
    }
}
