package tryCatch;
/*
KEY COMPONENTS OF EXCEPTION HANDLING IN JAVA
1.try : The block of code that you want to monitor for exception
2.catch : This block is used to handle the exception. It must be associated with try block
3.finally : A block that executes regardless of whether an exception is thrown or caught.
            It generally used to close resources like file or databases connections

4.throw : Used to explicitly throw an exception
5.throws : Used in the method signature to declare that a method might throw exception.


 */

/*
   TYPES OF EXCEPTIONS

1.Checked Exception : Exceptions that are checked at compile-time (e.q . IOException , SQLException).
2.Unchecked Exceptions : Exceptions that occurs at run-time (eg . NullPointerException , ArithmeticExceptions)

3.Error: Serious issues that are not typically handled by java programs (eg . OutOfMemoryError , StackOverFlowError)

 */
public class BasicExceptionHandling {
    public static void main(String[] args) {
        try{
            int result = divide(10 , 0);
            System.out.println("Result : " + result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage() + " not allowed");
        }finally {
            System.out.println("Executions completed! ");
        }
    }
    public static int divide(int a , int b){
        return a/b;
    }
}
