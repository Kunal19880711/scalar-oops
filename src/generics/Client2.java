package generics;

import java.util.ArrayList;
import java.util.List;

public class Client2 {
    private static void startEating(List<? extends Animal> animals) {
//        animals.add(new Dog());
        for (Animal animal : animals) {
            animal.eat();
        }
    }
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        startEating(dogs);
        startEating(cats);
    }
}

// Wildcards gives you upper bounds
// Super - gives you lower bounds
