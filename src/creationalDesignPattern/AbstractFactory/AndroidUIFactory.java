package creationalDesignPattern.AbstractFactory;

import creationalDesignPattern.AbstractFactory.components.buttons.AndroidButton;
import creationalDesignPattern.AbstractFactory.components.buttons.Button;
import creationalDesignPattern.AbstractFactory.components.dropdowns.AndroidDropDown;
import creationalDesignPattern.AbstractFactory.components.dropdowns.DropDown;
import creationalDesignPattern.AbstractFactory.components.menus.AndroidMenu;
import creationalDesignPattern.AbstractFactory.components.menus.Menu;

public class AndroidUIFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }

    @Override
    public DropDown createDropDown() {
        return new AndroidDropDown();
    }
}
