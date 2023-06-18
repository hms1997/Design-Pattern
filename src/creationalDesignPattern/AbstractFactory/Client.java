package creationalDesignPattern.AbstractFactory;

import creationalDesignPattern.AbstractFactory.components.Platform;
import creationalDesignPattern.AbstractFactory.components.buttons.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(Platform.ANDROID);

        UIFactory uiFactory = flutter.createUiFactory();

        Button button = uiFactory.createButton();
        button.changeSize();

        uiFactory.createMenu();
        uiFactory.createDropDown();

        Flutter flutter1 = new Flutter(Platform.IOS);
        UIFactory uiFactory1 = flutter1.createUiFactory();

        Button button1 = uiFactory1.createButton();
        button1.changeSize();

        uiFactory1.createMenu();
        uiFactory1.createDropDown();

    }
}
