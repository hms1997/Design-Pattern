package creationalDesignPattern.AbstractFactory.components.buttons;

public class IOSButton implements Button{
    public IOSButton() {
        System.out.println("IOS button created");
    }
    @Override
    public void changeSize() {

    }
}
