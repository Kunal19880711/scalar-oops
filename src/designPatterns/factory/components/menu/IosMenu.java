package designPatterns.factory.components.menu;

public class IosMenu implements Menu{
    @Override
    public void showMenu() {
        System.out.println("iOS Menu Displayed");
    }
}
