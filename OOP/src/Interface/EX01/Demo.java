package Interface.EX01;

public class Demo {
    public static void main(String[] args) {
        Bicycle bicycle = new MountainBike(20,10,1);
        MountainBike b = (MountainBike) bicycle;

        bicycle.applyBreak(1);
        System.out.println("Speed is "+b.getSpeed());

        bicycle.speedUp(2);
        System.out.println("Speed is "+b.getSpeed());
    }
}
