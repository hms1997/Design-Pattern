package structuralDesignPattern;

public class ChocolateCone implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;
    public ChocolateCone() {}
    public ChocolateCone(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }
    @Override
    public String getDescription() {
        if(iceCreamConeConstituents.getDescription() != null) return iceCreamConeConstituents.getDescription() + "Chocolate Cone ";
        return "Chocolate Cone";
    }

    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost() + 12;
    }
}