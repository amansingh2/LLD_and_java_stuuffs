package creationalDesignPatterns;

// Singleton :- Ensures a class has only one instance !

class SingletonPattern {
    private static SingletonPattern instance;

//    private SingletonPattern(){};

    public synchronized static SingletonPattern getInstance(){
        if(instance == null){
            instance = new SingletonPattern();
        }
        return instance;
    }
    public void showMessage() {
        System.out.println("Hello from Singleton");
    }
}
public class SingletonDemo{
    public static void main(String[] args) {
        SingletonPattern instance = SingletonPattern.getInstance();
        SingletonPattern instance1 = SingletonPattern.getInstance();
        instance.showMessage();
        instance1.showMessage();
        instance.showMessage();
    }
}
