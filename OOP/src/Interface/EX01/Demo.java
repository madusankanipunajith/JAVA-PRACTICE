package Interface.EX01;

public class Demo {

    public static void main(String[] args) {
        Bicycle bicycle = new MountainBike(20,10,1);
        System.out.println(Bicycle.x);
        bicycle.printX();

        MountainBike b = (MountainBike) bicycle;

        bicycle.applyBreak(1);
        System.out.println("Speed is "+b.getSpeed());

        bicycle.speedUp(2);
        System.out.println("Speed is "+b.getSpeed());
    }






    private static void smile() {
    }

    private static void sadStop() {
    }

    private static void hasAmma() {
    }

    private static void beCool() {
    }

    private static void expectTheUnexpected() {
    }

    private static void followDreams() {
    }

    boolean alive = true;
    boolean sad = true;
}
