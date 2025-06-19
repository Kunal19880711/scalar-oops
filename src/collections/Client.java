package collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Client {
    public static void main(String[] args) {
//        Collection

        // List
        // Ordered collection
        // random access through index
        // allow duplicate elements

        // List can be implemented by 4 things
        // Array, LinkedList, Vector, Stack

        // ArrayList
        // Insertion at end is O(1) amortized whereas at start or middle is O(n)
        // Random access is O(1)
        List<Integer> list1 = new ArrayList<>();

        // Insertion at start/end is O(1) but at middle is O(n)
        // Random access is O(n)
        List<Integer> list2 = new LinkedList<>();

        // Almost like ArrayList, thread-safe, growth is in your control.
        // Deprecated because Stack is better
        List<Integer> vector = new Vector<>();

        // Thread-safe, LIFO (Last In First Out) data structure and extends Vector
        List<Integer> stack = new Stack<>();

        // Queue
        // FIFO (First In First Out) data structure
        // Priority wise out
        // Change priority using comparator/comparable
        Queue<Integer> q1 = new PriorityQueue<>();

        q1.add(5);
        q1.add(10);
        q1.add(1);

        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.poll();
        }

        // Deque extends Queue
        // Double ended queue

        Deque<Integer> dll = new LinkedList<>();

        // Set
        // It does not allow duplicate elements

        // Random ordered
        // Hashmap with only keys
        Set<Integer> set1 = new HashSet<>();

        // Ordered - Insertion order is maintained
        // LRU - LinkedHashSet: LinkedList + HashMap
        Set<Integer> set2 = new LinkedHashSet<>();

        // Ordered - Natural ordering
        // Reverse order using Comparator / Comparable
        // Binary search tree (Red-Black Tree)
        Set<Integer> set3 = new TreeSet<>();

        set1.add(19);
        set1.add(10);
        set1.add(21);
        set1.add(5);
        set1.add(15);

        set2.add(19);
        set2.add(10);
        set2.add(21);
        set2.add(5);
        set2.add(15);

        set3.add(19);
        set3.add(10);
        set3.add(21);
        set3.add(5);
        set3.add(15);


        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        // Map
        // Key-Value pair

        // 1. HashMap - No order, allows one null key and multiple null values
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(19, "A");
        map1.put(10, "B");
        map1.put(21, "C");
        map1.put(5, "D");
        map1.put(15, "E");

        // 2. LinkedHashMap - Maintains insertion order
        Map<Integer, String> map2 = new LinkedHashMap<>();
        map2.put(19, "A");
        map2.put(10, "B");
        map2.put(21, "C");
        map2.put(5, "D");
        map2.put(15, "E");


        // 3. TreeMap - Sorted by keys (natural order), does not allow null keys
        Map<Integer, String> map3 = new TreeMap<>();
        map3.put(19, "A");
        map3.put(10, "B");
        map3.put(21, "C");
        map3.put(5, "D");
        map3.put(15, "E");

        // 4. Hashtable - Synchronized, does not allow null keys or values
        Map<Integer, String> map4 = new Hashtable<>();
        map4.put(19, "A");
        map4.put(10, "B");
        map4.put(21, "C");
        map4.put(5, "D");
        map4.put(15, "E");

        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map3);
        System.out.println(map4);
    }
}
