package corejava.advanced.lambdas;

public class Client {
    public static void main(String[] args) {
        // Using a class that implements Runnable
        Runnable printer = new Printer();

        // Anonymous class implementation of Runnable
        Runnable task = new Runnable() {
            @Override
            public void run() {
                // Any logic that needs to be executed in a separate thread
                System.out.println("Running task in a separate thread.");
            }
        };

        // Using lambda expression to implement Runnable
        Runnable lambdaTask = () -> System.out.println("Running task in a separate thread using lambda expression.");

        TestInterface test = (Integer a) -> {
            System.out.println("Running task with parameter: " + a);
            return a * 2;
        };

        Thread thread1 = new Thread(printer);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(lambdaTask);
        System.out.println("Running test functional interface: " + test.run(10));

        thread1.start();
        thread2.start();
        thread3.start(); // Start the thread using the lambda expression
        try {
            thread1.join(); // Wait for the thread to finish
            thread2.join(); // Wait for the thread to finish
            thread3.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            System.err.println("Thread was interrupted: " + e.getMessage());
        }
    }
}
