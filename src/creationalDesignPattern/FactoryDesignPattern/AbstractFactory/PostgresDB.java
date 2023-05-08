package creationalDesignPattern.FactoryDesignPattern.AbstractFactory;

public class PostgresDB implements DataBase {
    @Override
    public void setUrl() {

    }

    @Override
    public void getHostName() {

    }

    @Override
    public DataBaseType getDbType() {
        return DataBaseType.POSTGRES;
    }

    /***
     *
     * Implementation of all factory method will be inside PostgresDbFactory class
     */
    /*@Override
    public Query createQuery() {
        return new PostgresQuery();
    }*/

    @Override
    public DataBaseFactory createFactory() {
        return new PostgresDbFactory();
    }
}
