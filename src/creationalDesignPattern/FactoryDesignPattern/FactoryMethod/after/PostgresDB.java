package creationalDesignPattern.FactoryDesignPattern.FactoryMethod.after;

import creationalDesignPattern.FactoryDesignPattern.FactoryMethod.after.PostgresQuery;
import creationalDesignPattern.FactoryDesignPattern.FactoryMethod.after.Query;

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

    @Override
    public Query createQuery() {
        return new PostgresQuery();
    }
}
