package solidPrinciples;

interface Animal{
    void fly();
    void run();
    void swim();
}

//segregated interface!
interface Flyable{
    void fly();
}

interface Runnable{
    void run();
}

interface Swimmable{
    void  swim();
}
class Eagle implements Flyable{
    @Override
    public void fly() {
        System.out.println("Eagle is Flying....!");
    }
}

class Dog implements Runnable , Swimmable{
    @Override
    public void swim() {
        System.out.println("Dog Swimming.....");
    }

    @Override
    public void run() {
        System.out.println("Dog Running.......");
    }
}


public class InterfaceSegregation {
}
