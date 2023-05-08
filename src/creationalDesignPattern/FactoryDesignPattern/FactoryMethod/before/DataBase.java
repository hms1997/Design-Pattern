package creationalDesignPattern.FactoryDesignPattern.FactoryMethod.before;

public interface DataBase {
    void setUrl();
    void getHostName();

    DataBaseType getDbType();
}
