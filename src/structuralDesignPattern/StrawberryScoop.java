package structuralDesignPattern;

public class StrawberryScoop implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;
    public StrawberryScoop() {}
    public StrawberryScoop(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }
    @Override
    public String getDescription() {
        if(iceCreamConeConstituents.getDescription() != null) return iceCreamConeConstituents.getDescription() + "Strawberry Scoop ";
        return "Strawberry Scoop";
    }

    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost() + 25;
    }
}