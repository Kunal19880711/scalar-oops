package designPatterns.factory.uiFactory;
import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.menu.Menu;
import designPatterns.factory.components.button.IosButton;
import designPatterns.factory.components.menu.IosMenu;

public class IosUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
