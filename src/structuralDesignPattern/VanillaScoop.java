package structuralDesignPattern;

public class VanillaScoop implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;
    public VanillaScoop() {}
    public VanillaScoop(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }
    @Override
    public String getDescription() {
        if(iceCreamConeConstituents.getDescription() != null) return iceCreamConeConstituents.getDescription() + "Vanilla Scoop ";
        return "Vanilla Scoop";
    }

    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost() + 30;
    }
}