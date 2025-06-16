package adderSubtractorWithLocks;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    Value v;
    Lock lock;

    public Subtractor(Value v, Lock lock) {
        this.v = v;
        this.lock = lock;
    }

    @Override
    public Void call() {
        for (int i = 1; i <= 1000; i++) {
            lock.lock(); // Acquire the lock before modifying the value
            v.x -= i; // Decrement the value by 1
            lock.unlock(); // Release the lock after modifying the value
        }
        return null;
    }
}
