package corejava.basics.interfaces;

public class Dog extends Animal implements Runner {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Dog: " + getName() + " is eating dog food.");
    }

    @Override
    public void run() {
        System.out.println("Dog: " + getName() + " is running.");
    }
}
