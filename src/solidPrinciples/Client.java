package solidPrinciples;

import solidPrinciples.flyingBehaviour.FlyingBehaviour;
import solidPrinciples.flyingBehaviour.HighFly;
import solidPrinciples.flyingBehaviour.LowFly;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        FlyingBehaviour highFly = new HighFly();
        FlyingBehaviour lowFly = new LowFly();

        Pigeon b1 = new Pigeon("Pigeon1", "homely", lowFly);
        Eagle b2 = new Eagle("Eagle1", "furious", highFly);
        Penguin b3 = new Penguin("Grammy", "lovely");

        List<Bird> birds = new ArrayList<>();
        birds.add(b1);
        birds.add(b2);
        birds.add(b3);

        List<Flyable> flyableList = new ArrayList<>();
        flyableList.add(b1);
        flyableList.add(b2);

        List<Swimable> swimableList = new ArrayList<>();
        swimableList.add(b3);

        for (Bird bird : birds) {
            System.out.println("Name: " + bird.getName());
            System.out.println("Type: " + bird.getType());
            bird.eat();
            bird.makeSound();
        }

        for( Flyable flyable : flyableList) {
            flyable.fly();
        }

        for (Swimable swimable : swimableList) {
            swimable.swim();
        }
    }
}
