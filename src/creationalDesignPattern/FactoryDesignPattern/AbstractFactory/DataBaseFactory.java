package creationalDesignPattern.FactoryDesignPattern.AbstractFactory;

public interface DataBaseFactory {
    Query createQuery();
    Transaction createTransaction();
}
