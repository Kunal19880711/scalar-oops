package designPatterns.factory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.menu.Menu;
import designPatterns.factory.uiFactory.UIFactory;

public class Client {
    public static void main(String[] args) {
        testForPlatform(SupportedPlatforms.ANDROID);
        testForPlatform(SupportedPlatforms.IOS);
        testForPlatform(SupportedPlatforms.WINDOWS);
    }

    public static void testForPlatform(SupportedPlatforms platform) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.createUIFactory(platform);

        System.out.println("------------------"+platform+"-----------------------");

        Menu menu = uiFactory.createMenu();
        menu.showMenu();

        Button button = uiFactory.createButton();
        button.clickButton();
        button.changeSize();

        System.out.println("--------------------------------------------------");
        System.out.println();
    }
}
