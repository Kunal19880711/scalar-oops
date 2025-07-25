package designPatterns.decorator;

import designPatterns.decorator.addons.Cream;
import designPatterns.decorator.addons.Milk;
import designPatterns.decorator.beverage.Expresso;
import designPatterns.decorator.beverage.Hazelnul;

public class Client {
    public static void main(String[] args) {
        Beverage item1 = new Expresso();
        item1 = new Milk(new Milk(new Cream(item1)));

        System.out.println("Cost: " + item1.getCost());
        item1.getDescription();

        Beverage item2 = new Hazelnul();
        item2 = new Cream(new Cream(new Milk(item2)));

        System.out.println("Cost: " + item2.getCost());
        item2.getDescription();
    }
}
