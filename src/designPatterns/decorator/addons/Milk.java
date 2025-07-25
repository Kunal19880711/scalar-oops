package designPatterns.decorator.addons;

import designPatterns.decorator.Addon;
import designPatterns.decorator.Beverage;

public class Milk extends Addon {
    private Beverage base;

    public Milk(Beverage base) {
        if(base == null) {
            throw new IllegalArgumentException("Base beverage cannot be null");
        }
        this.base = base;
    }
    @Override
    public int getCost() {
        return 20 + base.getCost();
    }

    @Override
    public void getDescription() {
        base.getDescription();
        System.out.println("then, Milk based addon added");
    }
}
