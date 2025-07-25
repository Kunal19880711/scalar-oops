// src/solidPrinciples/Eagle.java
package solidPrinciples;

import solidPrinciples.flyingBehaviour.FlyingBehaviour;

public class Eagle extends Bird implements Flyable{
    private final FlyingBehaviour fb;

    public Eagle(String name, String type, FlyingBehaviour fb) {
        super(name, type);
        this.fb = fb;
    }

    @Override
    public void makeSound() {
        System.out.println("Screech!");
    }

    @Override
    public void fly() {
        // non-common code
        fb.fly(this.getName());
        // non-common code
        fb.glide(this.getName());
    }
}