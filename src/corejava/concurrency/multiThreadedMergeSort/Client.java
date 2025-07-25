package corejava.concurrency.multiThreadedMergeSort;

import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        ExecutorService es = Executors.newCachedThreadPool(); // Executors.newFixedThreadPool(10);
        try {
            List<Integer> list = new Random().ints(200_000, 1, 1_000_000_000).boxed().toList();
            System.out.println("Original list:" + list.size());
            printArray(list);

            Future<List<Integer>> future = es.submit(new Sorter(list, es)); // Submit the Sorter task to the executor service
            List<Integer> sortedList = future.get(); // Get the sorted array from the Future

            System.out.println("Sorted list:");
            printArray(sortedList);
        } catch (InterruptedException | java.util.concurrent.ExecutionException e)  {
            e.printStackTrace();
        } finally {
            es.shutdown(); // Shutdown the executor service
        }
    }

    private static void printArray(List<Integer> array) {
        System.out.println(array.stream()
                .map(String::valueOf)
                .collect(java.util.stream.Collectors.joining(" ")));
    }
}
