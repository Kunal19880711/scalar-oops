package generics;

public class Pair<V, T> {
    private V first;
    private T second;

    public Pair() {}

    public Pair(V first, T second) {
        this.first = first;
        this.second = second;
    }

    public V getFirst() {
        return first;
    }

    public void setFirst(V first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public static <K> void doSomething(K someValue) {
        System.out.println("Doing something with: " + someValue);
    }

    public static <K> void doSomething2() {
        System.out.println("Doing something without parameters");
    }
}
