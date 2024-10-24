package solidPrinciples;


/*
Def: Classes should be open for extension but close for modification,
    you should be able to add new functionalities without changing existing code.

Example: By Using shape an interface allowing different shape classes to implement it,
        you can extend without existing code

 */

interface Shape{
    double area();
}

class Circle implements Shape{
    private double radius;
    private static double PI = 3.14;
    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double area() {
        return PI*radius*radius;
    }
}

class Rectangle implements Shape{
    private double length;
    private double breath;

    public Rectangle(double length, double breath) {
        this.length = length;
        this.breath = breath;
    }

    @Override
    public double area() {
        return length*breath;
    }
}
public class OpenClose {
    public static void main(String[] args) {
        Shape circle = new Circle(2.0);
        Shape rectangle = new Rectangle(2 , 3);

        System.out.println(circle.area());
        System.out.println(rectangle.area());
    }

}
