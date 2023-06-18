package creationalDesignPattern.AbstractFactory;

import creationalDesignPattern.AbstractFactory.components.buttons.Button;
import creationalDesignPattern.AbstractFactory.components.buttons.IOSButton;
import creationalDesignPattern.AbstractFactory.components.dropdowns.DropDown;
import creationalDesignPattern.AbstractFactory.components.dropdowns.IOSDropdown;
import creationalDesignPattern.AbstractFactory.components.menus.IOSMenu;
import creationalDesignPattern.AbstractFactory.components.menus.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Menu createMenu() {
        return new IOSMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new IOSDropdown();
    }
}
