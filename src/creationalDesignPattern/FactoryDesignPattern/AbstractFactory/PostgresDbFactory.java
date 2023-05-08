package creationalDesignPattern.FactoryDesignPattern.AbstractFactory;

public class PostgresDbFactory implements DataBaseFactory{
    @Override
    public Query createQuery() {
        return new PostgresQuery();
    }

    @Override
    public Transaction createTransaction() {
        return new PostgresTransaction();
    }
}
