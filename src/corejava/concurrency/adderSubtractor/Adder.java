package corejava.concurrency.adderSubtractor;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    Value v;


    public Adder(Value v) {
        this.v = v;
    }

    public Void call() {
        for (int i = 1; i <= 1000; i++) {
            v.x += i; // Increment the value by 1
        }
        return null;
    }
}
