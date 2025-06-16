package adderSubtractorSynchronized;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    Value v;

    public Subtractor(Value v) {
        this.v = v;
    }

    @Override
    public Void call() {
        for (int i = 1; i <= 1000; i++) {
           synchronized (v) {
               v.x -= i; // Decrement the value by 1
           }
        }
        return null;
    }
}
