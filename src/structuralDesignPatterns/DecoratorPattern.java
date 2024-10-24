package structuralDesignPatterns;
/*
Decorator: This pattern allows behaviour to be added to individual objects
            either statically or dynamically, without affecting the behaviour
            of other objects from the same class!

Example : adding additional responsibility to shape class!

 */

interface Shape{
    void draw();
}
class  Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape Circle!");
    }
}

class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Shape Rectangle!");
    }
}

abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }


    @Override
    public void draw() {
        decoratedShape.draw();
    }
}

class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
       setRedBorder(decoratedShape);
    }
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Colour : RED");
    }
}
public class DecoratorPattern {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());

        System.out.println("Normal Circle!");
        circle.draw();


        System.out.println("\nRed Border Circle!");
        redCircle.draw();
    }

}
