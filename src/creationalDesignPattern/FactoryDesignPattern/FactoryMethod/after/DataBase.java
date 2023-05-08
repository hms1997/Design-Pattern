package creationalDesignPattern.FactoryDesignPattern.FactoryMethod.after;

import creationalDesignPattern.FactoryDesignPattern.FactoryMethod.after.Query;

public interface DataBase {
    void setUrl();
    void getHostName();

    DataBaseType getDbType();


    //This is a factory method

    Query createQuery();
}
