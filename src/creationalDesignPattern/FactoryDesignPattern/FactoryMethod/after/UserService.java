package creationalDesignPattern.FactoryDesignPattern.FactoryMethod.after;

public class UserService {
    DataBase dataBase;

    public UserService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    void registerUser() {
        Query q = dataBase.createQuery();
    }
}
