package solidPrinciples;

public class Penguin extends Bird implements Swimable {

    public Penguin (String name, String type) {
        super(name, type);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " squawks loudly.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims gracefully in the water.");
    }
}
