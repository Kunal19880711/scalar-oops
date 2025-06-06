package multithreadingProgram;

public class NumberWriter implements Runnable{
    private int number;

    public NumberWriter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Number: " + number + " written by " + Thread.currentThread().getName());
    }
}
