package exceptionHandling;

/*
the throw keyword allows you to throw an exception explicitly, and the throws
keyword declares that a method can throw an exception
 */

public class UsingThrow {
    public static void main(String[] args) {
        try{
            chechAge(15);
        }catch (IllegalArgumentException e){
            System.out.println("Exception : " + e.getMessage());
        }
    }

    private static void chechAge(int age) {
        if(age < 18){
            throw new IllegalArgumentException("Age must be 18 or above. ");
        }
        System.out.println("Access granted. ");
    }
}


