package designPatterns.decorator.beverage;

import designPatterns.decorator.Beverage;

public class Hazelnul extends Beverage {
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public void getDescription() {
        System.out.println("this is Hazelnut based beverage");
    }
}
