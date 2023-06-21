package structuralDesignPattern;

public class OrangeCone implements IceCreamConeConstituents{
    @Override
    public String getDescription() {
        return "orange cone ";
    }

    @Override
    public int getCost() {
        return 10;
    }
}