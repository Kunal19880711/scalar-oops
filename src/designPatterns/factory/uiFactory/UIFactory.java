package designPatterns.factory.uiFactory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.menu.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
}
