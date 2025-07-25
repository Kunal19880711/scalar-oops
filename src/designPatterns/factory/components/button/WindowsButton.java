package designPatterns.factory.components.button;

public class WindowsButton implements Button {
    @Override
    public void clickButton() {
        System.out.println("Windows Button Clicked");
    }

    @Override
    public void changeSize() {
        System.out.println("Windows Button Size Changed");
    }
}
