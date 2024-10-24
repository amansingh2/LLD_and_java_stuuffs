package javaEnums;

/*
Key Point about enum:
    TypeSafety : Enum provide compile time type safety , ensuring that the value that you work
    with are defined constants

    Singleton-like Behaviour : Enum Constants are implicitly public , static , and final
    meaning each enum constant is a single instance

    enum works smoothly with switch cases

 */

enum Day{
    SUNDAY , MONDAY , TUESDAY , WEDNESDAY , THURSDAY , FRIDAY , SATURDAY
}

// Adding fields and methods to enums
enum Planet{
    MERCURY(3.3 , 2.4),
    VENUS(4.8 , 6.06),
    EARTH(5.9 , 6.3);

    private final double mass;
    private final double radius;

    Planet(double mass , double radius){
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass(){
        return mass;
    }
    public double getRadius(){
        return radius;
    }

    public double surfaceGravity(){
        final double G = 6.6E-11;
        return G*mass/(radius * radius);
    }
}


// Enum Methods : values() , valueOf() and  ordinal().
enum Season{
    WINTER , SPRING , SUMMER , FALL
}

// enum with abstract methods!
enum Operation{
    ADD{
        public double apply(double a , double b){
            return a + b;
        }
    },
    SUBTRACT{
        public double apply(double a , double b){
            return a - b;
        }
    };

    public abstract double apply(double a , double b);

}
public class EnumExamples {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
//        System.out.println("Day is : " + day);


        Planet planet = Planet.EARTH;
        System.out.println("Planet is : " + planet);
        System.out.println("Mass of planet is : " + planet.getMass());

        /*
        // using values()
        for(Season season : Season.values()){
            System.out.println(season);
        }

        // using valueOf()
        Season season = Season.valueOf("SUMMER");
        System.out.println("Seasion is : " + season);

        // using ordinal!
        System.out.println("Ordinal of  " + season + " is  " + season.ordinal());

         */


//        double a = 5.5;
//        double b = 4.9;
//        System.out.println("Add :  " + Operation.ADD.apply(a , b));



    }
}
