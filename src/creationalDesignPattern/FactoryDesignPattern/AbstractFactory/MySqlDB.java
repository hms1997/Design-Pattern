package creationalDesignPattern.FactoryDesignPattern.AbstractFactory;

public class MySqlDB implements DataBase {
    @Override
    public void setUrl() {

    }

    @Override
    public void getHostName() {

    }

    @Override
    public DataBaseType getDbType() {
        return DataBaseType.MYSQL;
    }



    /***
     *
     * Implementation of all factory method will be inside MySqlDbFactory class
     */
    /*@Override
    public Query createQuery() {
        return new MySqlQuery();
    }*/

    @Override
    public DataBaseFactory createFactory() {
        return new MySqlDbFactory();
    }

}
