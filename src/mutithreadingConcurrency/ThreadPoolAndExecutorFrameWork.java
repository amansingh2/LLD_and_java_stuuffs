package mutithreadingConcurrency;

/*
managing thread manually can be cumbersome. The Executor Framework provides
thread pool management and task scheduling.

ExecutorService is a popular interface for managing a pool of threads
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolAndExecutorFrameWork {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3) ;

        for(int i = 0 ;  i < 5 ; i++){
            executor.submit(() -> {
                System.out.println("Executing Task by : " + Thread.currentThread().getName());
            });
        }
        executor.shutdown();

    }
}

/*
newFixedThreadPool() creates a method pool with a fixed number of threads
submit() schedule tasks for execution, and shutdown() initiate an orderly shutdown of
    executor service.

 */
