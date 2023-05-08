package creationalDesignPattern.FactoryDesignPattern.AbstractFactory;

public class MySqlDbFactory implements DataBaseFactory{
    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new MySqlTransaction();
    }
}
