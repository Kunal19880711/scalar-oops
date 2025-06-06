package multithreadingProgram;


// Not suggested to use this class as we can only extend one class.
// It is better to implement Runnable interface and pass it to a Thread.
public class Printer2 extends Thread{
    @Override
    public void run() {
        System.out.println("Printer 2 task: " + Thread.currentThread().getName());
    }
}
