package Inheritance;

public class MountainBike extends Bicycle{
    public int seatHeight;

    public MountainBike(int startHeight, int startSpeed, int startGear) {
        super(startSpeed, startGear); // we have to manage the parent class's attributes as well
        this.seatHeight = startHeight;
    }

    public void setSeatHeight(int value){
        this.seatHeight = value;
    }
    public void x(){
        this.speed = 1000;
    }

}
