package producerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private final Store store;
    private final Semaphore prodSemaphore;
    private final Semaphore consSemaphore;

    public Consumer(Store store, Semaphore prodSemaphore, Semaphore consSemaphore) {
        this.store = store;
        this.prodSemaphore = prodSemaphore;
        this.consSemaphore = consSemaphore;
    }

    @Override
    public void run() {
        try {
            while (true) {
                consSemaphore.acquire();
                store.removeItem();
                Thread.sleep(500);
                System.out.println("[ " + Thread.currentThread().getName() + " ] Consumed an item. Remaining items: " + store.getItems().size());
                prodSemaphore.release();
            }
        } catch (InterruptedException | IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }
}

