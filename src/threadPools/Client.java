package threadPools;

import multithreadingProgram.NumberWriter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

//        // Fixed thread pool
//        ExecutorService es = Executors.newFixedThreadPool(10); // Create a thread pool with 10 threads
//        int numberOfThreads = 1_000_000; // Number of threads to create
//
//        for (int i = 0; i < numberOfThreads; i++) {
//            // Create a new thread that writes a number
//            Runnable runnable = new NumberWriter(i + 1);
//            es.execute(runnable); // Submit the task to the thread pool
//        }

        // join the thread pool to ensure all tasks are completed

        // Cached thread pool - never makes a task wait. Gives priority to the task that is ready to run.
        ExecutorService es = Executors.newCachedThreadPool(); // Create a thread pool with 10 threads
        int numberOfThreads = 1_000_000; // Number of threads to create

        for (int i = 0; i < numberOfThreads; i++) {
            // Create a new thread that writes a number
            Runnable runnable = new NumberWriter(i + 1);
            es.execute(runnable); // Submit the task to the thread pool
        }

    }
}