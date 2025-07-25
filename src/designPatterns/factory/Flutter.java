package designPatterns.factory;

import designPatterns.factory.uiFactory.UIFactory;

public class Flutter {
    void refreshUI() {
        System.out.println("Refreshing Flutter UI");
    }

    // Factory method to create corresponding UIFactory based on platform
    public UIFactory createUIFactory(SupportedPlatforms platform) {
        return UIFactoryFactory.getUIFactory(platform);
    }
}
