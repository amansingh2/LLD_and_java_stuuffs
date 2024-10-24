package javaGenerics;

// generic class example!
class Box<T>{
    private T content;

    public void setContent(T content) {
        this.content = content;
    }
    public T getContent(){
        return content;
    }
}
// generic method example!
class Util {
    public static <T> void printArray(T[] array){
        for (T element : array){
            System.out.println(element);
        }
    }
}

class NumberBox<T extends Number>{
    private T content;
    public void setContent(T content){
        this.content  = content;
    }

    public T getContent() {
        return content;
    }
}

class Checking{
    private long Id;
    private String fName;
    private String lName;

    public Checking(long Id , String fName){
        this.Id = Id;
        this.fName = fName;
        this.lName = null;
    }

    @Override
    public String toString() {
        return "ID is : " + Id +  " first name is : " + fName +" and last name is " + (lName == null ? "NOT_AVAILABLE" : lName) ;
    }
}

class TreeParam <K , V , M>{
    K k ;
    V v;
    M m;
    public TreeParam(K k , V v , M m){
        this.k = k;
        this.v = v;
        this.m = m;
    }

    public K getK() {
        return k;
    }

    public M getM() {
        return m;
    }

    public V getV() {
        return v;
    }
}

public class JavaGenerics {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setContent("Hello Generics!");
        System.out.println(stringBox.getContent());

        /*
        // using generic methods!
        String [] words = {"apple" , "banana" , "oranges"} ;
        System.out.println("Printing String Array : ");
        Util.printArray(words);

        Checking ch = new Checking(1 , "ram");
        System.out.println(ch);

         */


        TreeParam<String , String , String> c = new TreeParam<>("a" , "b" , null);
        System.out.println(c.getK() + "  " + c.getM() + "  " + c.getV());


    }
}
