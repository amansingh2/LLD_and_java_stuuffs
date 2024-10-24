package structuralDesignPatterns;
/*
Facade : This pattern provides a simplified interface to a complex subsystem.

Example : A computer start-up process is simplified with a facade that encapsulates
           the complexities of starting various subsystems!

 */

class CPU{
    public void start(){
        System.out.println("CPU STARTED");
    }
}

class Memory{
    public void load(){
        System.out.println("Memory Loaded");
    }
}

class HardDrive{
    public void read(){
        System.out.println("Hard Drive reading!");
    }
}

class ComputerFacade{
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade(){
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }
    public void startComputer(){
        cpu.start();
        memory.load();
        hardDrive.read();
    }
}
public class FacadePattern {
    public static void main(String[] args) {
        ComputerFacade computer = new ComputerFacade();
        computer.startComputer();
    }
}
