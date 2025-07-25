package designPatterns.factory.uiFactory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.button.WindowsButton;
import designPatterns.factory.components.menu.Menu;
import designPatterns.factory.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
