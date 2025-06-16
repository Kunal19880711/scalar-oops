package producerConsumerSemaphore;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private int maxSize;
    private ConcurrentLinkedDeque<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        items = new ConcurrentLinkedDeque<>();
    }

    public void addItem() {
        //  System.out.println("Producer producing. Current size: " + items.size());
        items.add(new Object());
        //  System.out.println("Producer produced. Current size: " + items.size());
    }

    public void removeItem() {
        //  System.out.println("Consumer consuming. Current size: " + items.size());
        items.removeLast();
        //  System.out.println("Consumer consumed. Current size: " + items.size());
    }

    public int getMaxSize() {
        return maxSize;
    }

    public ConcurrentLinkedDeque<Object> getItems() {
        return items;
    }
}

