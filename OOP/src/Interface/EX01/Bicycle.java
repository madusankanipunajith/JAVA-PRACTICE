package Interface.EX01;

public interface Bicycle {
    int x = 0; // public static final by default

    // public abstract by default
    void applyBreak(int decrement);
    void speedUp(int increment);

    // default method after 1.8 version
    default void printX(){
        System.out.println("X : "+this.x);
    }

    // static method after 1.8 version
    static void statMethod(){
        System.out.println("Hello static method");
    }
}
