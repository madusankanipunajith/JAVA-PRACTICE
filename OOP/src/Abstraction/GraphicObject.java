package Abstraction;

// abstract classes can have both abstract methods and normal methods
// but interfaces can't have both ones only it can have abstract methods
public abstract class GraphicObject {
    private int x,y;

    void moveTo(int newX, int newY){
        System.out.println("Move to x : "+this.x+" and y : "+this.y);
    }

    abstract void draw();
    abstract void resize();
}
