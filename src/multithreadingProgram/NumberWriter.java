package multithreadingProgram;

public class NumberWriter implements Runnable{
    private int number;

    public NumberWriter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10);
            System.out.println("Number: " + number + " written by " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
