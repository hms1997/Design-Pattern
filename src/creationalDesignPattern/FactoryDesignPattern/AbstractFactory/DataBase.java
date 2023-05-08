package creationalDesignPattern.FactoryDesignPattern.AbstractFactory;

public interface DataBase {
    void setUrl();
    void getHostName();

    DataBaseType getDbType();


    //This is a factory method
    // We will move all factory method to a Abstract factory class(DatabaseFactory)
    //Query createQuery();

    DataBaseFactory createFactory();
}
