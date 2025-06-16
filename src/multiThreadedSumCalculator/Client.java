package multiThreadedSumCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available cores: " + cores);


        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 1_00_000; i++) {
            arr.add(i);
        }

        int chunkSize = arr.size() / cores;

        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<Long>> sunArrFutures = new ArrayList<>();

        for(int i = 0; i < cores; i++) {
            int start = i * chunkSize;
            int end = (i == cores - 1) ? arr.size() : start + chunkSize;

            ArraySummation arraySummation = new ArraySummation(arr, start, end);
            sunArrFutures.add(executorService.submit(arraySummation));
        }

        Long totalSum = 0L;
        for (Future<Long> future : sunArrFutures) {
            try {
                totalSum += future.get();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Total sum: " + totalSum);
    }
}
