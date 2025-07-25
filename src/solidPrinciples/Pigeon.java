package solidPrinciples;

import solidPrinciples.flyingBehaviour.FlyingBehaviour;

public class Pigeon extends Bird implements Flyable {
    private final FlyingBehaviour fb;

    public Pigeon(String name, String type, FlyingBehaviour fb) {
        super(name, type);
        this.fb = fb;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " coos softly.");
    }

    @Override
    public void fly() {
        // non-common code
        fb.fly(this.getName());
        // non-common code
        fb.glide(this.getName());
    }
}
