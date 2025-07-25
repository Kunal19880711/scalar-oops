package designPatterns.factory;

import designPatterns.factory.uiFactory.AndroidUIFactory;
import designPatterns.factory.uiFactory.IosUIFactory;
import designPatterns.factory.uiFactory.UIFactory;
import designPatterns.factory.uiFactory.WindowsUIFactory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatforms platform) {
        switch (platform) {
            case ANDROID:
                return new AndroidUIFactory();
            case IOS:
                return new IosUIFactory();
            case WINDOWS:
                return new WindowsUIFactory();
            default:
                throw new IllegalArgumentException("Unsupported platform: " + platform);
        }
    }
}
