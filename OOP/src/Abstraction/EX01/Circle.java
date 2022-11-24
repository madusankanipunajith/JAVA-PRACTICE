package Abstraction.EX01;

public class Circle extends GraphicObject {
    void write(){System.out.println("Writing a circle");}

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    void resize() {
        System.out.println("Resizing a circle");
    }
}
