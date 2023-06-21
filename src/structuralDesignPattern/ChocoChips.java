package structuralDesignPattern;

public class ChocoChips implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;
    public ChocoChips() {}
    public ChocoChips(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }
    @Override
    public String getDescription() {
        if(iceCreamConeConstituents.getDescription() != null) return iceCreamConeConstituents.getDescription() + "Choco chips ";
        return "Choco chips ";
    }

    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost() + 12;
    }
}
