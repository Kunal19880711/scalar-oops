package designPatterns.factory.components.button;

public class AndroidButton implements Button{
    @Override
    public void clickButton() {
        System.out.println("Android Button Clicked");
    }

    @Override
    public void changeSize() {
        System.out.println("Android Button Size Changed");
    }
}
