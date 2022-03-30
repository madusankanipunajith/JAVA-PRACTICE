package Abstraction.EX01;

import Abstraction.EX01.GraphicObject;

public class Rectangle extends GraphicObject {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }

    @Override
    void resize() {
        System.out.println("Resizing a rectangle");
    }
}
