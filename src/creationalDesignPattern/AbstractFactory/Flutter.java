package creationalDesignPattern.AbstractFactory;

import creationalDesignPattern.AbstractFactory.components.Platform;

public class Flutter {
    Platform platform;
    public Flutter(Platform platform) {
        this.platform = platform;
    }

    void setTheme() {
        System.out.println("setting theme");
    }

    public UIFactory createUiFactory() {
        return UIFactoryFactory.getUIFactoryForPlatForm(platform);
    }
}
