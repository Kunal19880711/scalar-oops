package corejava.concurrency.multithreadingProgram;

public class Client {
    public static void main(String[] args) {
        Printer printer = new Printer();
        System.out.println("Main thread: " + Thread.currentThread().getName());

        // Hiring a new thread to run the Printer task
        // Assigning the Thread new task.
        Thread thread = new Thread(printer);
        thread.start();


        // Creating a second thread using the Printer2 class
        Printer2 printer2 = new Printer2();
        printer2.start(); // Start the Printer2 thread

        try {
            thread.join(); // Wait for the printer thread to finish
            printer2.join(); // Wait for the printer2 thread to finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
