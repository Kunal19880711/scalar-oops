package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(12);
        list.add(45);
        list.add(7);

        Collections.sort(list);

        System.out.println(list);

        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Alice", 1, 20));
        students1.add(new Student("Bob", 2, 22));
        students1.add(new Student("Charlie", 3, 19));
        students1.add(new Student("David", 4, 21));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Alice", 1, 20));
        students2.add(new Student("Bob", 2, 22));
        students2.add(new Student("Charlie", 3, 19));
        students2.add(new Student("David", 4, 21));

        System.out.println("Before sorting: " + students1);
        Collections.sort(students1);
        System.out.println("After sorting: " + students1);

        System.out.println("*********************************");

        // Using custom comparator
        System.out.println("Before sorting: " + students2);
        Collections.sort(students2, new AgeComparator());
        System.out.println("After sorting: " + students2);
    }
}
