package corejava.concurrency.producerConsumerSemaphore;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private final Store store;
    private final Semaphore prodSemaphore;
    private final Semaphore consSemaphore;

    public Producer(Store store, Semaphore prodSemaphore, Semaphore consSemaphore) {
        this.store = store;
        this.prodSemaphore = prodSemaphore;
        this.consSemaphore = consSemaphore;
    }


    @Override
    public void run() {
        try {
            while (true) {
                prodSemaphore.acquire();
                store.addItem();
                System.out.println("[ " + Thread.currentThread().getName() + " ] Produced an item. Total items: " + store.getItems().size());
                consSemaphore.release();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
