package adderSubtractorSynchronized2;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    Value v;
    Student student;

    public Subtractor(Value v, Student student) {
        this.v = v;
        this.student = student;
    }

    @Override
    public Void call() {
        for (int i = 1; i <= 1000; i++) {
           synchronized (student) {
               v.x -= i; // Decrement the value by 1
           }
        }
        return null;
    }
}
