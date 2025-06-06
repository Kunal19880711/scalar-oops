package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        // create all animals i.e. dog, horse, dolphin and robot dog
        Dog dog = new Dog("Buddy", 5, "Golden Retriever");
        Horse horse = new Horse("Spirit", 7, "Mustang");
        Dolphin dolphin = new Dolphin("Flipper", 3, "Bottlenose");
        RobotDog robotDog = new RobotDog("RoboBuddy", "Model X");

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(horse);
        animals.add(dolphin);

        List<Runner> runners = new ArrayList<>();
        runners.add(dog);
        runners.add(horse);
        runners.add(robotDog);

        // feed all animals
        feedAnimals(animals);

        // make all animals run
        runAnimals(runners);
    }

    // static function to make all animal eat
    public static void feedAnimals(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }

    public static void runAnimals(List<Runner> runnerAnimals) {
        for (Runner animal : runnerAnimals) {
            animal.run();
        }
    }
}
