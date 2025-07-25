package corejava.basics.interfaces;

public class Horse extends Animal implements Runner {
    private String breed;

    public Horse(String name, int age, String breed) {
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
        System.out.println("Horse: " + getName() + " is eating hay.");
    }

    @Override
    public void run() {
        System.out.println("Horse: " + getName() + " is galloping.");
    }
}
