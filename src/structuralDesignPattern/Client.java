package structuralDesignPattern;

public class Client {
    public static void main(String[] args) {
        IceCreamConeConstituents iceCreamConeConstituents = new ChocoChips(
                new StrawberryScoop(
                        new VanillaScoop(
                                new ChocolateCone(
                                        new ChocoChips(
                                                new OrangeCone()
                                        )
                                )
                        )
                )
        );

        System.out.println(iceCreamConeConstituents.getDescription());;
        System.out.println(iceCreamConeConstituents.getCost());
    }
}
