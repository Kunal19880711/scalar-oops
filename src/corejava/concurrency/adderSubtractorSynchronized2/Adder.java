package corejava.concurrency.adderSubtractorSynchronized2;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    Value v;
    Student student;


    public Adder(Value v, Student student) {
        this.v = v;
        this.student = student;
    }

    public Void call() {
        for (int i = 1; i <= 1000; i++) {
            synchronized (student) {
                v.x += i; // Increment the value by 1
            }

        }
        return null;
    }
}
