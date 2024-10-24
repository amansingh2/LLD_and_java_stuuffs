package solidPrinciples;

class Bird{
    public void fly(){
        System.out.println("Flying....!");
    }
}

class Sparrow extends Bird{
    @Override
    public void fly() {
        System.out.println("Sparrow is Flying...!");
    }
}

class Ostrich extends Bird{
    // Ostrich cannot fly , so overriding will voilate LSP!
    //Instead, we should re-think the class structure to not force
    // Ostrich to inherit fly behaviour!
}
public class LiskovSubstitution {
    public static void main(String[] args) {

    }
}
