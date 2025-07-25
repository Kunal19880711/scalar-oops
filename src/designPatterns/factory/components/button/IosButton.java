package designPatterns.factory.components.button;

public class IosButton implements Button {
    @Override
    public void clickButton() {
        System.out.println("iOS Button Clicked");
    }

    @Override
    public void changeSize() {
        System.out.println("iOS Button Size Changed");
    }
}
