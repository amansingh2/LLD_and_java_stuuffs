package mutithreadingConcurrency;
/*
Volatile keyword is used to ensure visibility and ordering of variables across threads
-> When a variable is declared as volatile, it means that any read or write operation on that
    variable will be directly performed on the main memory rather than being stored in thread
    local cache.
-> this ensures that changes made by one thread to the volatile variable are immediately
    visible to other threads
 */
/*
1. Visibility: Changes made by one thread to a volatile variable are visible to other threads immediately
2.Ordering: Volatile variable prevent re-ordering of code by the compiler and CPU, providing a light form
            of synchronization
3.Atomicity: The volatile keyword does not guarantee atomicity. If multiple threads perform compound action
             like incrementing a variable, it won't be thread-safe.
 */

/*
When to use:
    1.When multiple threads need to read/write a simple variable and you only need visibility
        and ordering guarantee.
    2.Avoid for complex operation like increment or check-and-modify as it doesn't provide atomicity
 */

/*
Volatile vs synchronized
Volatile : Provides visibility and ordering but does not ensure atomicity. It's suitable for
            cases where simple read and write are sufficient
Synchronized: Provides both atomicity and visibility, ensuring thread-safe access to variables even
              for not compounded actions like incrementing
 */
public class VolatileKeyword extends Thread{
    private volatile boolean running = true;

    @Override
    public void run() {
        while(running){
            System.out.println("Thread is running...");
            try{
                Thread.sleep(100); // simulate some work
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted ");
            }
        }
        System.out.println("Thread has stopped...");
    }

    public void stopThread(){
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {
        VolatileKeyword thread = new VolatileKeyword();
        thread.start();
        Thread.sleep(500);

        System.out.println("Stopping the thread...");
        thread.stopThread();
    }
}
