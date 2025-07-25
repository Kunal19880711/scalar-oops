package corejava.concurrency.adderSubtractorSynchronized2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        Value value = new Value(); // Create a Value instance to hold the number
        Student student = new Student(1, "John Doe"); // Create a Student instance

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<Void> adderFuture = executor.submit(new Adder(value, student));
        Future<Void> subtractorFuture = executor.submit(new Subtractor(value, student));

        try {
            adderFuture.get(); // Wait for the adder task to finish
            subtractorFuture.get(); // Wait for the subtractor task to finish
        } catch (InterruptedException | ExecutionException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        executor.shutdown();

        System.out.println("Final value: " + value.x); // Print the final value after both threads have completed
    }
}
