package designPatterns.decorator.beverage;

import designPatterns.decorator.Beverage;

public class Expresso extends Beverage {
    @Override
    public int getCost() {
        return 60;
    }

    @Override
    public void getDescription() {
        System.out.println("this is Expresso based beverage");
    }
}
