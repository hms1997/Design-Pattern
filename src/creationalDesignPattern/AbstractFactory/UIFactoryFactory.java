package creationalDesignPattern.AbstractFactory;

import creationalDesignPattern.AbstractFactory.components.Platform;

public class UIFactoryFactory {
    public static UIFactory getUIFactoryForPlatForm(Platform platform) {
        return
                switch (platform) {
                    case ANDROID -> new AndroidUIFactory();
                    case IOS -> new IosUIFactory();
                };
    }
}
