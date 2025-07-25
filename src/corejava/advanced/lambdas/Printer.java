package corejava.advanced.lambdas;

public class Printer implements Runnable{
    @Override
    public void run() {
        // Any logic that needs to be executed in a separate thread
        System.out.println("[Done using a separate class] Running task in a separate thread.");
    }
}
