package mutithreadingConcurrency;
/*
Concurrency is the ability of program to execute multiple tasks simultaneously. it
doesn't necessarily mean that the task are running at the exact same moment, but they are in
progress at the same time!
 */

/*
Multithreading refers to the ability of the CPU or a single core within a CPU to provide
multiple thread of execution concurrently. Each thread can
be thought of as a separate path of execution.
 */

/*
in java there are mainly 2 methods of creating thread

1.extending thread class
2.implementing Runnable interface

 */

/*
the run() method defines the code that constitutes the new thread's task
The start() method is used to begin the thread's execution, which then calls the run() method.
 */
class Mythread extends Thread{
    @Override
    public void run() {
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(Thread.currentThread().getName() + " - value " + i);
        }
    }
}
/*


 */
public class Main {
    public static void main(String[] args) {
        Mythread thread1 = new Mythread();
        thread1.start();


        Mythread thread2 = new Mythread();
        thread2.start();


    }
}
