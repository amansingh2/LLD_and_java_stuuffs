package creationalDesignPatterns;


/* Defines an interface for creating an object but let's subclass alter the type
    of objects that will be created
*/



interface Shape{
    void draw();
}

class Circle implements Shape {
    public void draw(){
        System.out.println("Drawing creationalDesignPatterns.Circle");
    }
}

class Rectangle implements Shape {
    public synchronized void draw(){
        System.out.println("Drawing creationalDesignPatterns.Rectange!");
    }
}

class ShapeFactory{
    public Shape getShape(String shapeType) throws Exception {
//        if(shapeType == null){
//            return null;
//        }
        try{
            if(shapeType.equalsIgnoreCase("CIRCLE")){
                return new Circle();
            }else {
                return new Rectangle();
            }
        }catch (Exception e){
            throw new Exception("No Object");
        }

    }
}

public class Factory {
    public static void main(String[] args) throws Exception {
        ShapeFactory shapeFactory = new ShapeFactory();


        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();

        Shape Shape2 = shapeFactory.getShape("RECTANGLE");
        Shape2.draw();

    }
}
