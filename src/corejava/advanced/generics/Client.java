package corejava.advanced.generics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Pair<Double, Double> p1 = new Pair<>(1.0, 2.0);
        p1.setFirst(5.0);
        p1.setSecond(10.0);

        Pair<String, Integer> p2 = new Pair<>("Hello", 42);

        Pair p3 = new Pair<>();
        List aList = new ArrayList();

        System.out.println("First pair: " + p1.getFirst() + ", " + p1.getSecond());
        System.out.println("Second pair: " + p2.getFirst() + ", " + p2.getSecond());

        Pair.doSomething("Generic method call with String");
        Pair.<String>doSomething("Generic method call with String");
        Pair.doSomething2();
    }
}
