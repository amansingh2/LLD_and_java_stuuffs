package mutithreadingConcurrency;
import java.util.concurrent.locks.ReentrantLock;

/*
ReentrantLock: Offers more control than the synchronized, such as trying to acquire a lock
                or waiting for a specific time.

Concurrent Collection : Java provides thread - safe collection such as
                        ConcurrentHashmap and CopyOnWriteArrayList.
 */

public class Reentrant {
    private int count = 0;
    private ReentrantLock lock = new ReentrantLock();
    public void increment(){
        lock.lock();
        try {
            count++;
        }finally {
            lock.unlock();
        }
    }

    public int getCount(){
        return count;
    }
}
