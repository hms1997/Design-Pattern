package creationalDesignPattern.FactoryDesignPattern.FactoryMethod.after;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserService(new MySqlDB());
        userService.registerUser();
    }
}
