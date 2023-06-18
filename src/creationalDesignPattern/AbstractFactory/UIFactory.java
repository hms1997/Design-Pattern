package creationalDesignPattern.AbstractFactory;

import creationalDesignPattern.AbstractFactory.components.buttons.Button;
import creationalDesignPattern.AbstractFactory.components.dropdowns.DropDown;
import creationalDesignPattern.AbstractFactory.components.menus.Menu;

public interface UIFactory {
    Button createButton();
    Menu createMenu();
    DropDown createDropDown();
}
