package creationalDesignPattern.FactoryDesignPattern.AbstractFactory;

public class UserService {
    DataBase dataBase;

    public UserService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    // with factory method
    /*void registerUser() {
        Query q = dataBase.createQuery();
    }*/

    // with abstract factory interface (DataBaseFactory)

    void registerUser() {
        Query query = dataBase.createFactory().createQuery();
        Transaction transaction = dataBase.createFactory().createTransaction();
    }
}
