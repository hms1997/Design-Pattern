package creationalDesignPattern.FactoryDesignPattern.FactoryMethod.before;

public class UserService {
    DataBase dataBase;

    public UserService(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    void registerUser() {
        Query q;
        //Violets SRP and OCP
        if(dataBase.getDbType().equals(DataBaseType.MYSQL)) {
            q = new MySqlQuery();
        } else if (dataBase.getDbType().equals(DataBaseType.POSTGRES)) {
            q = new PostgresQuery();
        }
    }
}
