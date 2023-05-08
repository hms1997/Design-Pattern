package creationalDesignPattern.FactoryDesignPattern.FactoryMethod.after;

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

    @Override
    public Query createQuery() {
        return new MySqlQuery();
    }

}
