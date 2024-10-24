package mutithreadingConcurrency;
/*
java provides methods like wait() , notify() , and notifyAll() to help threads
communicate with each others

these methods must be called within a synchronized context.

 */

class SharedResource{
    private int value = 0;
    private boolean valueSet = false;

    public synchronized void produce() throws InterruptedException{
        while(valueSet){
            wait();
        }
        value++;
        System.out.println("Produced : " + value);
        valueSet = true;
        notify();
    }

    public synchronized void consume() throws InterruptedException{
        while(!valueSet){
            wait();
        }
        System.out.println("Consumed : "  + value);
        valueSet = false;
        notify();
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread producer = new Thread(() -> {
            try{
                for(int i = 0 ; i < 5 ; i++){
                    sharedResource.produce();
                }
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();;
            }
        });
        Thread consumer = new Thread(() -> {
            try{
                for(int i = 0 ;  i < 5 ; i++){
                    sharedResource.consume();
                }
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();

    }
}

/*
above example demonstrate a producer-consumer problem where one thread prodeces data
and another thread consumes it

The wait() method makes the thread wait untill it's notified, the notify() wakes up a single
waiting thread.

 */
