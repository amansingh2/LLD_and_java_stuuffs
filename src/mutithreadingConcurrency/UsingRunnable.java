package mutithreadingConcurrency;


class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(Thread.currentThread().getName() + " - value : " + i);
        }
    }
}

/*
By implementing Runnable, you can still pass the Runnable object to Thread constructor
and then start it.

This method is preferred when the class already extends another class (as java does not support multiple inheritance)

 */

public class UsingRunnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();


        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();

        /*
        Runnable thread2 = new MyRunnable();
        thread2.run();

         */

    }
}
