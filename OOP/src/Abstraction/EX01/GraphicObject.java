package Abstraction.EX01;

// abstract classes can have both abstract methods and normal methods
// but interfaces can't have both ones only it can have abstract methods
// abstract classes can't be instantiated
// multiple classes can't be inherited using classes. for that we are using Interfaces
public abstract class GraphicObject {
    private int x,y;
    public int z = 10;

    void moveTo(int newX, int newY){
        System.out.println("Move to x : "+this.x+" and y : "+this.y);
    }

    abstract void draw();
    abstract void resize();
}
