package Inheritance;

public class Demo {
    public static void main(String[] args) {
        MountainBike bike = new MountainBike(20,10,1);
        System.out.println("Gear is "+ bike.gear);
        System.out.println("Speed is "+ bike.speed);
        System.out.println("Seat Height is "+ bike.seatHeight);
        bike.applyBreak(1);
        System.out.println("Speed after breaking is "+ bike.speed);
        bike.x();
        System.out.println("New speed is "+ bike.speed);
    }
}
