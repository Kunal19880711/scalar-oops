package corejava.concurrency.webScapper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ClientFixedThreadPool {
    public static void main(String[] args) {
        int numCores = Runtime.getRuntime().availableProcessors();
        int numThreads = numCores * 8; // 8 times the number of cores as I/O operations are involved

        System.out.println("Available cores: " + numCores);

        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);
        try {
            long startTime = System.currentTimeMillis();
            String[] urls = new String[500];
            List<Future<Void>> futures = new ArrayList<>(500);

            for (int i = 0; i < 500; i++) {
                urls[i] = "https://example.com/" + (i + 1);
                futures.add( executorService.submit(new ScrapURL(urls[i])));
            }
            for (int i = 0; i < 500; i++) {
                futures.get(i).get();
            }
            long endTime = System.currentTimeMillis();
            System.out.printf("Time taken to scrape 500 URLs using fixed thread pool of size [%d] : %d ms%n", numThreads, (endTime - startTime));
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }
    }
}
