package corejava.concurrency.producerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize;
    private List<Object> items;

    public Store(int maxSize) {
        this.maxSize = maxSize;
        items = new ArrayList<>();
    }

    public void addItem() {
        System.out.println("Producer producing. Current size: " + items.size());
        items.add(new Object());
        System.out.println("Producer produced. Current size: " + items.size());
    }

    public void removeItem() {
        System.out.println("Consumer consuming. Current size: " + items.size());
        items.remove(items.size() - 1);
        System.out.println("Consumer consumed. Current size: " + items.size());
    }

    public int getMaxSize() {
        return maxSize;
    }

    public List<Object> getItems() {
        return items;
    }
}

