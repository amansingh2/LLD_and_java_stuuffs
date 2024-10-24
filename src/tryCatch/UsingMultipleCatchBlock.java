package tryCatch;

import static tryCatch.BasicExceptionHandling.divide;

public class UsingMultipleCatchBlock {
    public static void main(String[] args) {
        try{
            int [] numbers = {1 , 2 , 3};
            System.out.println(numbers[5]); // throw array index out of bound
            int result = divide(10 , 0); // throw Arithmetic exception
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Execution complete!");
        }
    }
}

/*
any one exception can be thrown!
 */
