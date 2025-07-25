package corejava.advanced.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(2, 5, 8, 4, 0, 11, 3, 6, 9, 10, 2, 5, 8, 4, 0, 11, 3, 6, 9, 10);
        Stream<Integer> stream1 = list1.stream();
//        stream1 = stream1.distinct();
//        stream1.forEach((Integer elem) -> System.out.println("Distinct element: " + elem));
        stream1.distinct().limit(4).forEach((Integer elem) -> System.out.println("[1] Distinct element: " + elem));

        list1
                .stream()
                .distinct()
                .limit(4)
                .forEach((Integer elem) -> System.out.println("[2] Distinct element: " + elem));

        List<Integer> list2 = list1.stream().distinct().limit(4).toList();
        System.out.println("[3] Distinct elements as a list: " + list2);

        Optional<Integer> maybeA1 = list1.stream().distinct().findFirst();
        if (maybeA1.isPresent()) {
            System.out.println("[4] First distinct element: " + maybeA1.get());
        } else {
            System.out.println("[4] No distinct elements found.");
        }

        // filter, map, and reduce example
        List<Integer> list3 = list1
                .stream()
                .filter(elem -> elem % 2 == 0)
                .map(elem -> elem * elem)
//                .collect(Collectors.toList());
                .toList();
        System.out.println("[5] Filtered even elements: " + list3);

        Optional<Integer> maybeSum5 = list1
                .stream()
                .filter(elem -> elem % 2 == 0)
                .map(elem -> elem * elem)
                .reduce((a, b) -> a + b); // get returned to current sum
        if (maybeSum5.isPresent()) {
            System.out.println("[6] Sum of squares of even elements: " + maybeSum5.get());
        } else {
            System.out.println("[6] No elements to sum.");
        }

        Integer sum6 = list1
                .stream()
                .filter(elem -> elem % 2 == 0)
                .map(elem -> elem * elem)
//                .reduce(0, (a, b) -> a + b)
                .reduce(0, Integer::sum);
        System.out.println("[7] Sum of squares of even elements with identity: " + sum6);
    }
}
