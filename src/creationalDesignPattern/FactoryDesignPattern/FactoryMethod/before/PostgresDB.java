package creationalDesignPattern.FactoryDesignPattern.FactoryMethod.before;

public class PostgresDB implements DataBase{
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
}
