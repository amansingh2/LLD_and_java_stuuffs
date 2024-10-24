package mutithreadingConcurrency;
/*
Thread LifeCycle!
1.New : Thread is created but not yet started.
2.Runnable : Thread is ready to run and waiting for CPU time.
3.Blocked/Waiting : Thread is waiting for resources or some condition to be met
4.Running: Thread is actively executing
5.Terminated: Thread has finished executing.

 */

/*
Synchronization is required when multiple threads access shared resources to avoid
inconsistent results

The Synchronized keyword ensures that only one thread can access
a particular block of code or method at a time.
 */

/*
-> the increment() method is synchronized, ensuring that only one thread can
    increment the counter at a time!

-> The join() method ensures that the main thread waits for both threads to complete

 */
class Counter{
    private int count = 0;
    public synchronized void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class UsingSynchronization {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for(int i = 0 ; i < 10 ; i++){
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for(int i = 0 ; i < 10 ; i++){
                counter.increment();
            }
        });

        thread1.start();;
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Final Count : " + counter.getCount());
    }
}
