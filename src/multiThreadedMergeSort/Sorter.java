package multiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> arrayToSort;
    ExecutorService executorService;

    public Sorter(List<Integer> arrayToSort, ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() {
        try {
            // base case
            if (arrayToSort.size() <= 1) {
                return arrayToSort; // If the list has one or no elements, it's already sorted
            }

            int size = arrayToSort.size();
            int mid = size / 2; // Find the middle index

            List<Integer> leftHalf = arrayToSort.subList(0, mid); // Left half of the list
            List<Integer> rightHalf = arrayToSort.subList(mid, size); // Right half of the list

            Sorter leftSorter = new Sorter(leftHalf, executorService); // Create a sorter for the left half
            Sorter rightSorter = new Sorter(rightHalf, executorService); // Create a sorter for the right half

            Future<List<Integer>> leftSortedArrFuture = executorService.submit(leftSorter);
            Future<List<Integer>> rightSortedArrFuture = executorService.submit(rightSorter);


            List<Integer> leftSortedArr = leftSortedArrFuture.get(); // Get the sorted left half
            List<Integer> rightSortedArr = rightSortedArrFuture.get(); // Get the sorted right half

            // Merge the two sorted halves

            List<Integer> mergedList = calcMergeLists(leftSortedArr, rightSortedArr);
            return mergedList;
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>(); // Handle exceptions appropriately
        } finally {
            // Optionally, you can shutdown the executor service here if you want to clean up resources
            // executorService.shutdown();
        }
    }

    private static List<Integer> calcMergeLists(List<Integer> leftSortedArr, List<Integer> rightSortedArr) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        while (i < leftSortedArr.size() && j < rightSortedArr.size()) {
            if (leftSortedArr.get(i) <= rightSortedArr.get(j)) {
                mergedList.add(leftSortedArr.get(i));
                i++;
            } else {
                mergedList.add(rightSortedArr.get(j));
                j++;
            }
        }
        while (i < leftSortedArr.size()) {
            mergedList.add(leftSortedArr.get(i));
            i++;
        }
        while (j < rightSortedArr.size()) {
            mergedList.add(rightSortedArr.get(j));
            j++;
        }
        return mergedList;
    }
}
