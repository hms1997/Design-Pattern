package creationalDesignPattern.AbstractFactory.components.buttons;

public class AndroidButton implements Button{
    public AndroidButton() {
        System.out.println("android button created");
    }

    @Override
    public void changeSize() {

    }
}
