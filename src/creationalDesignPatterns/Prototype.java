package creationalDesignPatterns;
/*
Prototype: Creates objects by copying an existing object,
            useful when object creation is costly!
 */

import java.util.HashMap;
import java.util.Map;

abstract class ShapePrototype implements Cloneable{
    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}

class CirclePrototype extends ShapePrototype {
    public CirclePrototype(){
        type = "Circle";
    }
    public void draw(){
        System.out.println("Drawing a Circle");
    }
}

class RectanglePrototype extends ShapePrototype{
    public RectanglePrototype(){
        type = "Rectangle";
    }
    public void draw(){
        System.out.println("Drawing a Rectangle");
    }
}
class ShapeCache{
    private static Map<String , ShapePrototype> shapeMap = new HashMap<>();

    public static ShapePrototype getShape(String shapeId){
        ShapePrototype cachedShape = shapeMap.get(shapeId);
        return (ShapePrototype) cachedShape.clone();
    }

    public static void loadCache(){
        CirclePrototype circlePrototype = new CirclePrototype();
        circlePrototype.setId("1");
        shapeMap.put(circlePrototype.getId() , circlePrototype);

        RectanglePrototype rectanglePrototype = new RectanglePrototype();
        rectanglePrototype.setId("2");
        shapeMap.put(rectanglePrototype.getId() , rectanglePrototype);
    }
}

// client code

public class Prototype {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        ShapePrototype clonedShape1 = ShapeCache.getShape("1");
        System.out.println("Shape " + clonedShape1.getType());
        clonedShape1.draw();

        ShapePrototype clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape " + clonedShape2.getType());
        clonedShape2.draw();
    }

}
