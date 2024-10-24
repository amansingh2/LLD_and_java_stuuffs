package creationalDesignPatterns;

/*
AbstactFactory: Provides an interface for creating families of related or dependent
                objects without specifying their concrete classes


 */

interface Chair{
    void create();
}

class VictoriaChair implements Chair{
    @Override
    public void create() {
        System.out.println("Creating Victoria creationalDesignPatterns.Chair");
    }
}

class ModernChair implements Chair{
    @Override
    public void create() {
        System.out.println("Creating Modern creationalDesignPatterns.Chair");
    }
}

interface Sofa{
    void create();
}

class VictoriaSofa implements Sofa{
    @Override
    public void create() {
        System.out.println("Creating Victoria creationalDesignPatterns.Sofa");
    }
}
class ModernSofa implements Sofa{
    @Override
    public void create() {
        System.out.println("Creating Modern creationalDesignPatterns.Sofa");
    }
}

interface FurnitureFactory{
    Chair createChair();
    Sofa createSofa();
}

class VictorianFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new VictoriaChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictoriaSofa();
    }
}

class ModernFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}



public class AbstractFactory {
    public static void main(String[] args) {
        FurnitureFactory victorianFactory = new VictorianFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();
        victorianChair.create();
        victorianSofa.create();


        FurnitureFactory modernFactory = new ModernFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        modernChair.create();
        modernSofa.create();
    }
}
