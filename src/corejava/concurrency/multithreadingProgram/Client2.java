package corejava.concurrency.multithreadingProgram;

public class Client2 {
    public static void main(String[] args) {
        int numberOfThreads = 100; // Number of threads to create
        Thread[] threads = new Thread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            // Create a new thread that writes a number
            threads[i] = new Thread(new NumberWriter(i + 1));
        }

        for (int i = 0; i < numberOfThreads; i++) {
            threads[i].start(); // Start each thread
        }

        try {
            for (int i = 0; i < numberOfThreads; i++) {
                threads[i].join(); // Wait for each thread to finish
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
