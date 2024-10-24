package solidPrinciples;

/*
High level modules should not depend on low-level modules.
Both should depend on abstraction, not on concrete classes

// before applying DIP!

class KeyBoard{
    //....
}

class Monitor{
    //........
}
class Computer{
    private KeyBoard keyboard;
    private Monitor monitor;

    public Computer(){
        this.keyboard = new KeyBoard();
        this.monitor = new Monitor();
    }
}
 */

interface Peripheral{
    //
}

class KeyBoard implements Peripheral{
    //
}

class Monitor implements Peripheral{
    //
}
class Computer{
    private Peripheral peripheral;

    public Computer(Peripheral peripheral) {
        this.peripheral = peripheral;
    }
}
public class DependencyInversion {
}
