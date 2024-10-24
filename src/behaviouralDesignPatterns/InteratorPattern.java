package behaviouralDesignPatterns;

/*
-> Provides a way to access the elements of a collection object sequentially
    without using its underlying  representation!

Example:
    A collection of names where you can iterate over the elements

 */

import java.util.Iterator;
import java.util.List;

class NameRepository implements Iterable<String>{
    private List<String> names;
    public NameRepository(List<String>names){
        this.names = names;
    }

    public Iterator<String> iterator(){
        return names.iterator();
    }

}
public class InteratorPattern {
    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository(List.of("Aman" , "Madhur" , "Alex"));
        for(String name : nameRepository){
            System.out.println(name);
        }
    }
}
