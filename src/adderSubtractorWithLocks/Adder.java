package adderSubtractorWithLocks;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    Value v;
    Lock lock;

    public Adder(Value v, Lock lock) {
        this.v = v;
        this.lock = lock;
    }

    public Void call() {
        for(int i = 1; i <= 1000; i++) {
            lock.lock();
            v.x += i; // Increment the value by 1
            lock.unlock();
        }
        return null;
    }
}
