package corejava.concurrency.threadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client2 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool(); // Create a cached thread pool
        NumberMultiplier numberMultiplier = new NumberMultiplier(5); // Create a NumberMultiplier instance with the number 5
        try {
            Future<Integer> future = es.submit(numberMultiplier);
            // Get the result from the Future and print it
            Integer result = future.get();
            System.out.println("Result of multiplication: " + result);
        } catch (Exception e) {
            e.printStackTrace(); // Handle any exceptions that occur during task execution
        } finally {
            es.shutdown(); // Shutdown the executor service
        }
    }
}
